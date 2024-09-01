package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;

import java.time.Duration;

public class AddCartTest extends BaseTest{

    @Test
    public void addCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://member.daraz.lk/user/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("abc.com");
        loginPage.enterPassword("abc44@#");
        loginPage.clickLogin();


        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("laptop");

        ProductDetailsPage productDetail = new ProductDetailsPage(driver);
        productDetail.selectRandomProduct();

        AddToCart addToCart = new AddToCart(driver);
        addToCart.addToCart();
        addToCart.goToCart();
    }
}
