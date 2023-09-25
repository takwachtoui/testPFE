package affectation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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


    public void clickDatenaissance() {
        // Click on the date picker field to open the date picker popup
        WebElement datenaissanceField = driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1h9uykw-MuiInputBase-input-MuiOutlinedInput-input\"]"));
        datenaissanceField.click();

       /* // You may need to wait for the date picker popup to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1h9uykw-MuiInputBase-input-MuiOutlinedInput-input\"]"))); // Replace with the actual locator for the date picker popup

        // Assuming your date picker allows selecting day, month, and year separately
        WebElement dayField = driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin') and @aria-colindex='4' and @data-timestamp='1764716400000'] "));
        dayField.click();

        WebElement monthField = driver.findElement(By.xpath("//div[contains(@class, 'MuiPickersMonth-month') and text()='YourMonthName']")); // Replace 'YourMonthName' with the actual month name
        monthField.click();

        WebElement yearField = driver.findElement(By.xpath("//div[contains(@class, 'MuiPickersYear-year') and text()='" + year + "']"));
        yearField.click();*/
    }

    public void enterDate(String date) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1h9uykw-MuiInputBase-input-MuiOutlinedInput-input\"]"))); // Replace with the actual ID of the cin field
        dateField.sendKeys(date);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("femme")) {
            WebElement femmeRadioButton = driver.findElement(By.xpath("//input[@value=\"Femme\"]")); // Remplacez cette expression XPath par celle correspondant au bouton radio "Femme"
            if (!femmeRadioButton.isSelected()) {
                femmeRadioButton.click();
            }
        }
        // Vous pouvez ajouter d'autres options pour les autres genres si nécessaire.
    }

   /* public void selectConsultant() {
        WebElement consultantDropdown = driver.findElement(By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorInfo MuiInputBase-formControl  css-1cc0o68-MuiInputBase-root-MuiOutlinedInput-root-MuiSelect-root\"]")); // Remplacez par l'expression XPath appropriée pour la liste déroulante
        Select dropdown = new Select(consultantDropdown);
        dropdown.selectByVisibleText("Consultant");
    }*/

    public void clickDrop() {
        // Click on the date picker field to open the date picker popup
        WebElement dropField = driver.findElement(By.id("simple-select-label"));
        dropField.click();
    }


}
