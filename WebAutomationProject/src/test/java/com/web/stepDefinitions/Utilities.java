package com.web.stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

    public void esVisibleElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait (FirstTestingApproach.driver,20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }
}
