package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;

public class ProductViewTest extends BaseTest{

    @Test
    public void testViewProduct() {
        startTest("View Product Test");

        try {
            driver.get("https://www.daraz.lk/");
            HomePage homePage = new HomePage(driver);
            homePage.searchProduct("laptop");

            ProductDetailsPage productDetail = new ProductDetailsPage(driver);
            productDetail.selectRandomProduct();

            logTestPass("Product viewed successfully.");
        } catch (Exception e) {
            logTestFail("Product view test failed: " + e.getMessage());
        }

    }
}
