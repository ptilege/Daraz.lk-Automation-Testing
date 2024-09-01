package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.xpath("//a[normalize-space()='SEARCH']");
    private WebDriverWait wait;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchProduct(String productName){
        driver.findElement(searchBox).sendKeys(productName);

        driver.findElement(searchButton).click();
    }


}
