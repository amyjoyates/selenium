package com.amy.selenium;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

    private String testUrl;

    @Test
    public void testLinks() throws IOException, InterruptedException {

        WebDriver driver;
        testUrl = "https://www.servicenow.com/products-by-category.html";
        System.setProperty("webdriver.gecko.driver","/Users/aswanson/webdriver-local-test-package/drivers/geckodriver");

        driver = new FirefoxDriver();

        // Do the actual test steps
        TestSteps at = new TestSteps();
        at.actualTest(driver, testUrl);

        driver.quit();

    }

}
