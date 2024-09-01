package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

        // Setting system information for the report
        extent.setSystemInfo("Host Name", "Your Host");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Pasindu Tharaka");

    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
            extent.flush();
        }
    }
    protected void startTest(String testName) {
        test = extent.createTest(testName);
    }

    protected void logTestInfo(String message) {
        if (test != null) {
            test.info(message);
        }
    }

    protected void logTestPass(String message) {
        if (test != null) {
            test.pass(message);
        }
    }

    protected void logTestFail(String message) {
        if (test != null) {
            test.fail(message);
        }
    }


}
