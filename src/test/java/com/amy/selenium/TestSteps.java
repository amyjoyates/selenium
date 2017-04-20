package com.amy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.amy.core.HomePage;
import com.amy.core.SearchResults;

public class TestSteps {
    
    public void actualTest (WebDriver driver, String testUrl) throws InterruptedException {
        driver.get(testUrl);
        Thread.sleep(5000);
        
        HomePage.searchLink(driver).click();
        driver.findElement(By.className("search-icon")).click();

        HomePage.searchInput(driver).sendKeys("Express");
        HomePage.searchInput(driver).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        Assert.assertTrue(SearchResults.searchResultValues(driver).isDisplayed());
    }

}
