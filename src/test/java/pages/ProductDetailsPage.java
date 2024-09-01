package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ProductDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By allProducts = By.cssSelector("div.Bm3ON");

    public ProductDetailsPage(WebDriver driver){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.driver = driver;
    }

    public void selectRandomProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(allProducts));
        List<WebElement> products = driver.findElements(allProducts);
//        System.out.println(products.size());
        if(products.size() > 0){
            Random random = new Random();
            int index = random.nextInt(products.size());
            WebElement selectedProduct = products.get(index);

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectedProduct);



            selectedProduct.click();




//            System.out.println(selectedProduct.getText());
        }else{
            throw new RuntimeException("No products found to select");
        }
    }

}
