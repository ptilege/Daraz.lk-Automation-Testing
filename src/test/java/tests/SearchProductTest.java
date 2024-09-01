package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchProductTest extends BaseTest{

    @Test
    public void testSearchProduct(){
        driver.get("https://www.daraz.lk/");
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("laptop");

        Assert.assertTrue(driver.getTitle().contains("laptop"));
        System.out.println("Page Title: " + driver.getTitle());

    }
}
