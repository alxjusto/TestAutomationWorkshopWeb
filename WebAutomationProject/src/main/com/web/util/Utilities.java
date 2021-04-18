package web.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.driver.BaseDriver;
import web.pageObjects.BusquedaEbayPage;

public class Utilities extends BaseDriver {

//    WebDriver driver;

    public void esVisibleElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait (driver,20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }
}
