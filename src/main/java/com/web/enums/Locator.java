package com.web.enums;

public enum Locator {

    CATEGORY_OPTION_LOCATOR_HOMEPAGE("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/a[text()='%s']"),
    SUBCATEGORY_OPTION_LOCATOR_HOMEPAGE("//div[@id='mainContent']//li[contains(@class,'cat-nav')]/div//a[text()='%s']"),
    CARROUSEL_OPTION_LOCATOR_ESF("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']"),
    CARROUSEL_OPTION_LOCATOR_ESV("//div[@id='mainContent']//div[contains(@class,'carousel')]//p[text()='%s']");
    
    String value;

    Locator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
