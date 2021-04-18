package web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import web.util.Utilities;

public class BusquedaEbayPage {

    public WebDriver driver;

    public BusquedaEbayPage(WebDriver driver) {
        this.driver = driver;
    }

    private String precio = "";

    private By campoDeBusqueda = By.id("gh-ac");
    private By botonDeBusqueda = By.id("gh-btn");
    private By articuloDeCompra = By.xpath("//div[@id='srp-river-results']//li[@class='s-item      ']//a[@class='s-item__link']/h3");
    private By estadoArticuloDesdeDetalle = By.id("vi-itm-cond");


    Utilities utilities = new Utilities();


    public void openURL() {
        driver.get("https://www.ebay.com/");
    }

    public void verificarEstadoDelArticuloDesdeDetalleDeArticulo() {
        buscarArticuloPorNombreDesdePaginaPrincipal("Shoes");
        elegirArticuloDesdePaginaPrincipal();

       // Assert.assertEquals("el estado es correcto","Nuevo sin caja",obtenerEstadoDelArticuloDesdeDetalleDelArticulo());
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


    public void BuscarProductoPorPrecio2() throws InterruptedException {
        utilities.esVisibleElemento(driver.findElement(campoDeBusqueda));
        driver.findElement(campoDeBusqueda).sendKeys(precio);
        driver.findElement(botonDeBusqueda).click();
        Thread.sleep(5000);
    }

}
