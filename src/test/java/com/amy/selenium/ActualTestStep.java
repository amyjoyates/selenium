package com.amy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ActualTestStep {
    
    public void actualTest (WebDriver driver, String testUrl) throws InterruptedException {
        driver.get(testUrl);
        Thread.sleep(5000);
        driver.findElement(By.className("search-icon")).click();

        driver.findElement(By.id("gsc-i-id2")).sendKeys("Express");
        driver.findElement(By.id("gsc-i-id2")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        Assert.assertTrue( driver.findElement(By.id("resInfo-2")).isDisplayed());
    }

}
