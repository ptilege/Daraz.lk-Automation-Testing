package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
    private By passwordField = By.xpath("//input[@placeholder='Please enter your password']");
    private By loginButton = By.xpath("//button[normalize-space()='LOGIN']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String userName){
        driver.findElement(usernameField).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
