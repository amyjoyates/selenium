package com.amy.core;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebElement element = null;

    public static WebElement searchLink(WebDriver driver){
        element = driver.findElement(By.id("search-icon"));
        return element;
    }

    public static WebElement searchInput(WebDriver driver){
        element = driver.findElement(By.id("gsc-i-id2"));
        return element;
    }

}
