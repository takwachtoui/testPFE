package testaffectation;

import affectation.AjoutConsultant;
import affectation.Login;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.awt.*;


import java.io.IOException;

public class TestLogin {

    public WebDriver driver;
    private ExtentTest test;
@BeforeClass
    public void setUp() {
        // Initialize the WebDriver
    driver = WebDriverSingleton.getDriver();
    test = TestReport.getInstance().createTest("LoginTest");
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException{
        // Create a test with the name "testLogin"

        // Log test steps

        test.info("S'authentifier en tant que gestionnaire des services");

        // ...

        // Log a pass or fail status
        test.pass("Test passed.");
        // Instantiate the Login Page Object
        Login loginPage = new Login(driver);

        driver.get("http://localhost:3002/");

        // Enter the username and password
        loginPage.enterUsername("Test@gmail.com");
        loginPage.enterPassword("1111");

        // Click the login button
        loginPage.clickLoginButton();
        Thread.sleep(5000); // Sleep for 3 seconds (3000 milliseconds)

    }

    @AfterClass
    public void tearDown() {
        // Do not quit the WebDriver here to keep the session open
        TestReport.getInstance().flushReport();
    }

}
