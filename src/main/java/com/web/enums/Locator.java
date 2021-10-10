package com.web.enums;

import org.openqa.selenium.By;

public enum Locator {

    CATEGORY_OPTION_LOCATOR_HOMEPAGE(By.xpath("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/a[text()='%s']")),
    SUBCATEGORY_OPTION_LOCATOR_HOMEPAGE(By.xpath("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/div//a[text()='%s']")),
    CARROUSEL_OPTION_LOCATOR_ESF(By.xpath("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']")),
    CARROUSEL_OPTION_LOCATOR_ESV(By.xpath("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']"));
    
    private final By locator;

    Locator(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

}
