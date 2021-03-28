package com.web.tests;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FirstTestingApproach {

    public static WebDriver driver;
    public String precio = "";

    @Before
    public void main(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        try {
            driver = new ChromeDriver();

        } catch (WebDriverException wde) {
            System.out.println(wde.getMessage());
        }
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void BuscarProductoPorNombre1() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("gh-ac")).sendKeys("shoes");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/h3")).click();
        Thread.sleep(5000);
        precio = driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();
        System.out.println(precio);
    }

    @Test
    public void BuscarProductoPorPrecio2() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("gh-ac")).sendKeys(precio);
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(5000);
    }


    @After
    public void CloseDriver() {
        driver.close();
    }

}
