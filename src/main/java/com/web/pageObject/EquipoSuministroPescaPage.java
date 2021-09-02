package com.web.pageObject;

import com.web.enums.Locator;
import com.web.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EquipoSuministroPescaPage {

    public WebDriver driver;
    Utilities utilities = new Utilities();

    public EquipoSuministroPescaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By carrouselOptionLocator = By.xpath(Locator.CARROUSEL_OPTION_LOCATOR_ESF.getValue());

    public void choseCarrouselOptionFromEquipoSuministro(String option) {
        By updatedLocator = utilities.updateElementLocator(carrouselOptionLocator, option);
        utilities.elementToBeClickable(updatedLocator);
        driver.findElement(updatedLocator).click();
    }
}
