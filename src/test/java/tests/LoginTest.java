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


        driver.get("https://member.daraz.lk/user/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("tharakapasindu13@gmail.com");
        loginPage.enterPassword("Pti5446@#");
        loginPage.clickLogin();




    }
}
