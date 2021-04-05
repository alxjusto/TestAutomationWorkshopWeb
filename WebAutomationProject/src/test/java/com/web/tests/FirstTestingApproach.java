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
    private String precio = "";

    private By campoDeBusqueda = By.id("gh-ac");
    private By botonDeBusqueda = By.id("gh-btn");
    private By articuloDeCompra = By.xpath("//div[@id='srp-river-results']//li[@class='s-item      ']//a[@class='s-item__link']/h3");
    private By precioArticuloDeCompra = By.xpath("//*[@id='prcIsum']");


    Utilities utilities = new Utilities();

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
    public void BuscarProductoPorNombre1() {
        utilities.esVisibleElemento(driver.findElement(campoDeBusqueda));
        driver.findElement(campoDeBusqueda).sendKeys("shoes");
        driver.findElement(botonDeBusqueda).click();


        utilities.esVisibleElemento(driver.findElement(articuloDeCompra));
        driver.findElement(articuloDeCompra).click();

        utilities.esVisibleElemento(driver.findElement(precioArticuloDeCompra));
        precio = driver.findElement(precioArticuloDeCompra).getText();

        System.out.println(precio);
    }

    @Test
    public void BuscarProductoPorPrecio2() throws InterruptedException {
        utilities.esVisibleElemento(driver.findElement(campoDeBusqueda));
        driver.findElement(campoDeBusqueda).sendKeys(precio);
        driver.findElement(botonDeBusqueda).click();
        Thread.sleep(5000);
    }


    @After
    public void CloseDriver() {
        driver.close();
    }

}
