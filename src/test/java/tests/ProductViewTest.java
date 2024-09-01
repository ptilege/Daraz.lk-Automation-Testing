package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;

public class ProductViewTest extends BaseTest{

    @Test
    public void testViewProduct(){
        driver.get("https://www.daraz.lk/");
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("laptop");

        ProductDetailsPage productDetail = new ProductDetailsPage(driver);
        productDetail.selectRandomProduct();

    }
}
