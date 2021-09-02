package com.web.util;

import com.web.driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends BaseDriver {

    public void elementToBeClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public By updateElementLocator(By element, String elementName) {
        String updateIdentifier = element.toString();
        updateIdentifier = updateIdentifier.substring(updateIdentifier.indexOf("//"));
        updateIdentifier = String.format(updateIdentifier, elementName);
        return By.xpath(updateIdentifier);
    }

    public void mouseHover(By element) {
        Actions actions = new Actions(driver);
        WebElement option = driver.findElement(element);
        actions.moveToElement(option).perform();
    }
}
