package com.web.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

    public void encontrarElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait (FirstTestingApproach.driver,20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }
}
