package com.amy.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ChromeDriverTest {

    @Test
    public void testTitle() throws IOException, InterruptedException {

        WebDriver driver;

        String testUrl = "https://www.servicenow.com/products-by-category.html";
        System.setProperty("webdriver.chrome.driver", "/Users/aswanson/webdriver-local-test-package/drivers/chrome/osx/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);

        // Do the actual test steps
        ActualTestStep at = new ActualTestStep();
        at.actualTest(driver, testUrl);

        driver.quit();
    }

}
