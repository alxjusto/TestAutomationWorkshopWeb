package com.web.pageObject;

import com.web.enums.Locator;
import com.web.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EquipoPescaVintagePage {

    public WebDriver driver;
    Utilities utilities = new Utilities();

    private final By carrouselOptionLocatorESV = By.xpath(Locator.CARROUSEL_OPTION_LOCATOR_ESV.getValue());

    public EquipoPescaVintagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choseOptionFromEquipoPescaVintage(String option) {
        By updatedLocator = utilities.updateElementLocator(carrouselOptionLocatorESV, option);
        utilities.elementToBeClickable(updatedLocator);
        driver.findElement(updatedLocator).click();
    }

}
