package testaffectation;

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

public class TestAjoutConsultant{

    public WebDriver driver;
    private ExtentTest test;
    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = WebDriverSingleton.getDriver();
        test = TestReport.getInstance().createTest("AjoutConsultantTest");

    }

    @Test(priority = 4)
    public void testAjoutConsultant() throws InterruptedException {
        //ExtentTest test = TestReport.createTest("TestAjoutConsultant");

        // Log test steps
        test.info("Ajouter un consultant");
        // ...

        // Log a pass or fail status
        test.pass("Test passed.");
        // Instantiate the AjoutConsultant Page Object
        AjoutConsultant ajoutConsultantPage = new AjoutConsultant(driver);

        // Add your test steps for AjoutConsultant functionality here
        // For example:
        ajoutConsultantPage.clickCompteButton();
        Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
        ajoutConsultantPage.clickAjoutButton();
        ajoutConsultantPage.enterMatricule("9654");
        // ... add more test steps specific to AjoutConsultant

        // Entering a Cin number digit by digit
        ajoutConsultantPage.enterCin("0");
        ajoutConsultantPage.enterCin("9");
        ajoutConsultantPage.enterCin("9");
        ajoutConsultantPage.enterCin("3");
        ajoutConsultantPage.enterCin("1");
        ajoutConsultantPage.enterCin("0");
        ajoutConsultantPage.enterCin("5");
        ajoutConsultantPage.enterCin("0");

        ajoutConsultantPage.enterName("Zouaoui");
        ajoutConsultantPage.enterPrenom("Aya");

        // Entering a Contact number digit by digit
        ajoutConsultantPage.enterContact("9");
        ajoutConsultantPage.enterContact("4");
        ajoutConsultantPage.enterContact("9");
        ajoutConsultantPage.enterContact("3");
        ajoutConsultantPage.enterContact("1");
        ajoutConsultantPage.enterContact("0");
        ajoutConsultantPage.enterContact("5");
        ajoutConsultantPage.enterContact("0");

        ajoutConsultantPage.enterAddress("Lac2");
        ajoutConsultantPage.enterEmail("Takwa@gmail.com");
        ajoutConsultantPage.enterPass("1199");
        ajoutConsultantPage.clickDatenaissance();
        ajoutConsultantPage.enterDate("01221995");

        // Scroll to the end of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Add a delay to ensure content loading (you may adjust the sleep time)
        Thread.sleep(2000);

        // The code that follows here will be executed after scrolling completes
        // Add your additional actions or assertions here

        ajoutConsultantPage.selectGender("femme");
        ajoutConsultantPage.selectTypeDeCompte("Consultant");
        //ajoutConsultantPage.enterPost("Analyste Fonctionnel");
        //ajoutConsultantPage.enterPole("QA");
        ajoutConsultantPage.clickProfilePicture();
        try {
            // Provide the correct path to the FileUploadScript.exe
            Runtime.getRuntime().exec("C:\\Users\\takwa chtioui\\OneDrive - GFI\\Documents\\FileUploadScript.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(12000);
        ajoutConsultantPage.clickSubmit();
        Thread.sleep(7000);

    }
    @AfterClass
    public void tearDown() {
        // Do not quit the WebDriver here to keep the session open
        TestReport.getInstance().flushReport();
    }
}
