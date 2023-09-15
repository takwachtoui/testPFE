package affectation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private final WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
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

    public void clickCompteButton() {
        WebElement compteButton = driver.findElement(By.xpath("//li[4]//div[1]//span[2]"));
        compteButton.click();
    }

    public void clickAjoutButton() {
        WebElement compteButton = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']"));
        compteButton.click();
    }
    public void enterMatricule (String matricule) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement matriculeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Idc']")));
        matriculeField.sendKeys(matricule);
    }
    public void enterCin(String cin) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement cinField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cin_c']"))); // Replace with the actual ID of the cin field
        cinField.clear();
        cinField.sendKeys(cin);
    }

    public void enterName(String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='nom_c']"))); // Replace with the actual ID of the cin field
        nameField.sendKeys(name);
    }

    public void enterPrenom(String prenom) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement prenomField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='prenom_c']"))); // Replace with the actual ID of the cin field
        prenomField.sendKeys(prenom);
    }

    public void enterContact(String contact) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement contactField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='num_tel_c']"))); // Replace with the actual ID of the cin field
        contactField.sendKeys(contact);
    }

    public void enterAddress(String address) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='adresse_c']"))); // Replace with the actual ID of the cin field
        addressField.sendKeys(address);
    }

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='emailc']"))); // Replace with the actual ID of the cin field
        emailField.sendKeys(email);
    }

    public void enterPass(String pass) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='mdp_c']"))); // Replace with the actual ID of the cin field
        passField.sendKeys(pass);
    }

    public void enterDatenaissance(String datenaissance) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement datenaissanceField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='mdp_c']"))); // Replace with the actual ID of the cin field
        datenaissanceField.sendKeys(datenaissance);
    }
}
