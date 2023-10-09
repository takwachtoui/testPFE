package testaffectation;

import affectation.AjoutManagerInetum;
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

public class TestAjoutManagerInetum {

    public WebDriver driver;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = WebDriverSingleton.getDriver();
        test = TestReport.getInstance().createTest("AjoutManagerInetum");

    }

    @Test(priority = 5)
    public void TestAjoutManagerInetum() throws InterruptedException {
        //ExtentTest test = TestReport.createTest("TestAjoutConsultant");

        // Log test steps
        test.info("Ajouter un Manager Inetum");
        // ...

        // Log a pass or fail status
        test.pass("Test passed.");
        // Instantiate the AjoutConsultant Page Object
        AjoutManagerInetum ajoutMangerInetumPage = new AjoutManagerInetum(driver);

        // Add your test steps for AjoutConsultant functionality here
        // For example:
        // Scroll to the top of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");

        ajoutMangerInetumPage.clickCompteButton();
        Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
        ajoutMangerInetumPage.clickAjoutButton();

        js.executeScript("window.scrollTo(0, 0);");

        ajoutMangerInetumPage.enterMatricule("8525");
        // ... add more test steps specific to AjoutConsultant

        // Entering a Cin number digit by digit
        ajoutMangerInetumPage.enterCin("0");
        ajoutMangerInetumPage.enterCin("9");
        ajoutMangerInetumPage.enterCin("9");
        ajoutMangerInetumPage.enterCin("3");
        ajoutMangerInetumPage.enterCin("1");
        ajoutMangerInetumPage.enterCin("0");
        ajoutMangerInetumPage.enterCin("5");
        ajoutMangerInetumPage.enterCin("0");

        ajoutMangerInetumPage.enterName("Zouaoui");
        ajoutMangerInetumPage.enterPrenom("Nermine");

        // Entering a Contact number digit by digit
        ajoutMangerInetumPage.enterContact("9");
        ajoutMangerInetumPage.enterContact("4");
        ajoutMangerInetumPage.enterContact("9");
        ajoutMangerInetumPage.enterContact("3");
        ajoutMangerInetumPage.enterContact("1");
        ajoutMangerInetumPage.enterContact("0");
        ajoutMangerInetumPage.enterContact("5");
        ajoutMangerInetumPage.enterContact("0");

        ajoutMangerInetumPage.enterAddress("Lac2");
        ajoutMangerInetumPage.enterEmail("Takwa@gmail.com");
        ajoutMangerInetumPage.enterPass("1199");
        ajoutMangerInetumPage.clickDatenaissance();
        ajoutMangerInetumPage.enterDate("01221995");

        // Scroll to the end of the page

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Add a delay to ensure content loading (you may adjust the sleep time)
        Thread.sleep(2000);

        // The code that follows here will be executed after scrolling completes
        // Add your additional actions or assertions here

        ajoutMangerInetumPage.selectGender("femme");
        ajoutMangerInetumPage.selectTypeDeCompte("Manager_Inetum");
        //ajoutConsultantPage.enterPost("Analyste Fonctionnel");
        //ajoutConsultantPage.enterPole("QA");
        ajoutMangerInetumPage.clickProfilePicture();
        try {
            // Provide the correct path to the FileUploadScript.exe
            Runtime.getRuntime().exec("C:\\Users\\takwa chtioui\\OneDrive - GFI\\Documents\\FileUploadScript.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(12000);
        ajoutMangerInetumPage.clickSubmit();
        Thread.sleep(7000);

    }

    @AfterClass
    public void tearDown() {
        // Do not quit the WebDriver here to keep the session open
        TestReport.getInstance().flushReport();
    }
}