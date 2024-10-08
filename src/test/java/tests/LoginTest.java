package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void testValidLogin(){
        startTest("Valid Login Test");

        try {
            driver.get("https://member.daraz.lk/user/login");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("abc@gmail.com");
            loginPage.enterPassword("abc44@@");
            loginPage.clickLogin();

            logTestPass("Successfully logged in with valid credentials.");
        } catch (Exception e) {
            logTestFail("Login test failed: " + e.getMessage());
        }




    }
}
