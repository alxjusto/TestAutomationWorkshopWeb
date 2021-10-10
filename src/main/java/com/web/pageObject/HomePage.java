package com.web.pageObject;

import com.web.enums.Locator;
import com.web.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
    Utilities utilities = new Utilities();

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choseCategoryAndSubcategory(String categoryOption, String subcategoryOption) {
        choseCategory(categoryOption);
        choseSubcategory(subcategoryOption);
    }

    private void choseSubcategory(String subcategoryOption) {
        By updatedLocator = utilities.updateElementLocator(Locator.SUBCATEGORY_OPTION_LOCATOR_HOMEPAGE.getLocator(), subcategoryOption);
        utilities.elementToBeClickable(updatedLocator);
        utilities.mouseHover(updatedLocator);
        driver.findElement(updatedLocator).click();
    }

    public void choseCategory(String categoryOption) {
        By updatedLocator = utilities.updateElementLocator(Locator.CATEGORY_OPTION_LOCATOR_HOMEPAGE.getLocator(), categoryOption);
        utilities.elementToBeClickable(updatedLocator);
        utilities.mouseHover(updatedLocator);
    }
}
