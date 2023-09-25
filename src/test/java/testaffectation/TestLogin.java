package testaffectation;

import affectation.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestLogin {

    private static WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        driver.get("http://localhost:3002/");
    }

    @Test(priority = 1)
    public void testLogin() {
        // Instantiate the Login Page Object
        Login loginPage = new Login(driver);
        // Enter the username and password
        loginPage.enterUsername("Roua@gmail.com");
        loginPage.enterPassword("9966");

        // Click the login button
        loginPage.clickLoginButton();
        try {
            Thread.sleep(4000); // Sleep for 4 seconds (4000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.clickCompteButton();
        // Wait for the dashboard page to load (replace with a more specific condition)
        // You should use explicit waits here based on a reliable element that appears on the dashboard.
        // For example:
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
        // Then you can add assertions or validations on the dashboardElement.

        // Pause for a few seconds to observe the result (replace with explicit wait in real tests)
        try {
            Thread.sleep(2000); // Sleep for 4 seconds (4000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.clickAjoutButton();


        loginPage.enterMatricule("9654");

        loginPage.enterCin("0");
        loginPage.enterCin("9");
        loginPage.enterCin("9");
        loginPage.enterCin("3");
        loginPage.enterCin("1");
        loginPage.enterCin("0");
        loginPage.enterCin("5");
        loginPage.enterCin("0");

        loginPage.enterName("Takwa");
        loginPage.enterPrenom("Chtioui");

        loginPage.enterContact("9");
        loginPage.enterContact("4");
        loginPage.enterContact("9");
        loginPage.enterContact("3");
        loginPage.enterContact("1");
        loginPage.enterContact("0");
        loginPage.enterContact("5");
        loginPage.enterContact("0");

        loginPage.enterAddress("Lac2");
        loginPage.enterEmail("Takwa@gmail.com");
        loginPage.enterPass("1199");


        loginPage.clickDatenaissance();


        loginPage.enterDate("01221995");

        loginPage.selectGender("femme");


        loginPage.clickDrop();
    }


}
