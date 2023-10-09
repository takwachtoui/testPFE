package affectation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    private final WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r1:")));
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("pswrd"));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.className("MuiButton-containedInfo")); // Replace with the actual class name
        loginButton.click();
    }
}
