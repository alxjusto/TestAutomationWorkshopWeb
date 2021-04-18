package com.web.stepDefinitions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestingApproach {

    public static WebDriver driver;
    private String precio = "";

    private By campoDeBusqueda = By.id("gh-ac");
    private By botonDeBusqueda = By.id("gh-btn");
    private By articuloDeCompra = By.xpath("//div[@id='srp-river-results']//li[@class='s-item      ']//a[@class='s-item__link']/h3");
    private By estadoArticuloDesdeDetalle = By.id("vi-itm-cond");


    Utilities utilities = new Utilities();

    @Before
    public void main() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        try {
            driver = new ChromeDriver();

        } catch (WebDriverException wde) {
            System.out.println(wde.getMessage());
        }
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void verificarEstadoDelArticuloDesdeDetalleDeArticulo() {
        buscarArticuloPorNombreDesdePaginaPrincipal("Shoes");
        elegirArticuloDesdePaginaPrincipal();
        Assert.assertEquals("el estado es correcto","Nuevo sin caja",obtenerEstadoDelArticuloDesdeDetalleDelArticulo());
    }

    public void buscarArticuloPorNombreDesdePaginaPrincipal(String articulo) {
        utilities.esVisibleElemento(driver.findElement(campoDeBusqueda));
        driver.findElement(campoDeBusqueda).sendKeys(articulo);
        driver.findElement(botonDeBusqueda).click();
    }

    public void elegirArticuloDesdePaginaPrincipal() {
        utilities.esVisibleElemento(driver.findElement(articuloDeCompra));
        driver.findElement(articuloDeCompra).click();
    }

    public String obtenerEstadoDelArticuloDesdeDetalleDelArticulo() {
        utilities.esVisibleElemento(driver.findElement(estadoArticuloDesdeDetalle));
        return driver.findElement(estadoArticuloDesdeDetalle).getText();
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