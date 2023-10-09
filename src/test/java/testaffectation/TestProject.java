package testaffectation;

import affectation.Client;
import affectation.Project;
import com.aventstack.extentreports.ExtentTest;
import affectation.AjoutConsultant;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.IOException;

public class TestProject{

    public WebDriver driver;
    private ExtentTest test;
    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = WebDriverSingleton.getDriver();
        test = TestReport.getInstance().createTest("ProjectTest");

    }

    @Test(priority = 3)
    public void testClient() throws InterruptedException {
        //ExtentTest test = TestReport.createTest("TestAjoutConsultant");

        // Log test steps
        test.info("Ajouter un projet");
        // ...

        // Log a pass or fail status
        test.pass("Test passed.");
        // Instantiate the AjoutConsultant Page Object
        Project projectPage = new Project(driver);

        projectPage.clickProjectButton();
        projectPage.clickAjoutButton();
        projectPage.enterDescription("Test");
        projectPage.enterTitre("Alpha");
        projectPage.selectClient("CED");
        projectPage.clickSubmit();

        Thread.sleep(5000);

    }
    @AfterClass
    public void tearDown() {
        // Do not quit the WebDriver here to keep the session open
        TestReport.getInstance().flushReport();
    }
}
