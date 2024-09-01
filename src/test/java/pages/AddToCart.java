package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//button[contains(@class,'pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl')]");
    private By cartButton = By.xpath("//span[@class='cart-icon-daraz']//*[name()='svg']");

    public AddToCart(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void goToCart(){
        driver.findElement(cartButton).click();
    }
}
