package com.amy.core;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class SearchResults {

    private static WebElement element = null;

    public static WebElement searchResultValues(WebDriver driver){
        element = driver.findElement(By.id("resInfo-2"));
        return element;
    }

}
