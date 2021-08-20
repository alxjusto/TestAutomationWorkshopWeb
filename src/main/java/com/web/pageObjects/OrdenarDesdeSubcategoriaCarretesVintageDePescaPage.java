package com.web.pageObjects;

import com.web.util.Utilidades;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OrdenarDesdeSubcategoriaCarretesVintageDePescaPage {

    public WebDriver driver;

    public OrdenarDesdeSubcategoriaCarretesVintageDePescaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    private String precio = "";

//    private By campoDeBusqueda = By.id("gh-ac");
//    private By botonDeBusqueda = By.id("gh-btn");
//    private By articuloDeCompra = By.xpath("//div[@id='srp-river-results']//li[@class='s-item      ']//a[@class='s-item__link']/h3");
//    private By estadoArticuloDesdeDetalle = By.id("vi-itm-cond");

    private By opcionCategoriaPaginaPrincipal = By.xpath("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/a[text()='%s']");
    private By opcionSubCategoriaPaginaPrincipal = By.xpath("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/div//a[text()='%s']");
    private By opcionDeCarouselDesdeEquipoSuministroYPesca = By.xpath("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']");
    private By opcionDeCarouselDesdeEquipoDePescaVintage = By.xpath("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']");

    Utilidades utilidades = new Utilidades();


    public void openURL(String url) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void elegirCategoriaYSubcategoria(String opcionDeCategoriaPaginaPrincipal, String opcionDeSubCategoriaMasPopulares) {
        elegirCategoriaDesdePaginaPrincipal(opcionDeCategoriaPaginaPrincipal);
        selegirSubcategoriaDesdePaginaPrincipal(opcionDeSubCategoriaMasPopulares);
    }

    private void selegirSubcategoriaDesdePaginaPrincipal(String opcionDeSubCategoriaMasPopulares) {
        By elementoActualizado = utilidades.actualizarIdentificadorElemento(opcionSubCategoriaPaginaPrincipal, opcionDeSubCategoriaMasPopulares);
        utilidades.puedoHacerClickSobreElemento(elementoActualizado);
        utilidades.posicionarPunteroMouse(elementoActualizado);
        driver.findElement(elementoActualizado).click();
    }

    public void elegirCategoriaDesdePaginaPrincipal(String opcionDeCategoriaPaginaPrincipal) {
        By elementoActualizado = utilidades.actualizarIdentificadorElemento(opcionCategoriaPaginaPrincipal, opcionDeCategoriaPaginaPrincipal);
        utilidades.puedoHacerClickSobreElemento(elementoActualizado);
        utilidades.posicionarPunteroMouse(elementoActualizado);
    }

    public void elegirOpcionDesdeCarruselEquipoYSuministroDePesca(String opcion) {
        By elementoActualizado = utilidades.actualizarIdentificadorElemento(opcionDeCarouselDesdeEquipoSuministroYPesca, opcion);
        utilidades.puedoHacerClickSobreElemento(elementoActualizado);
        driver.findElement(elementoActualizado).click();
    }

    public void elegirOpcionDesdeCarruselEquipoDePescaVintage(String opcion) {
        By elementoActualizado = utilidades.actualizarIdentificadorElemento(opcionDeCarouselDesdeEquipoDePescaVintage, opcion);
        utilidades.puedoHacerClickSobreElemento(elementoActualizado);
        driver.findElement(elementoActualizado).click();
    }

    public void selleccionarTipoDeOrdenamiento(String tipoDeOrdenamiento) {

    }

}
