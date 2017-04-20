package com.amy.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SafariTest {

    private String testUrl;

    @Test
    public void testTitle() throws IOException, InterruptedException {

        WebDriver driver;
        testUrl = "https://www.servicenow.com/products-by-category.html";

        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);

        // Do the actual test steps
        TestSteps at = new TestSteps();
        at.actualTest(driver, testUrl);

        driver.quit();
    }


}
