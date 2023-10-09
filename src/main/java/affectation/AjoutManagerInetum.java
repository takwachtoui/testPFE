package affectation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjoutManagerInetum {

    private final WebDriver driver;

    public AjoutManagerInetum(WebDriver d) {
        this.driver = d;
    }

    public void clickCompteButton() {
        WebElement compteButton = driver.findElement(By.xpath("//li[4]//div[1]//span[2]"));
        compteButton.click();
    }
    public void clickAjoutButton() {
        WebElement compteButton = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']"));
        compteButton.click();
    }

    public void enterMatricule(String matricule) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement matriculeField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Idc']")));
        matriculeField.sendKeys(matricule);
    }

    public void enterCin(String cin) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cinField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cin_c']")));
        cinField.clear();
        cinField.sendKeys(cin);
    }

    public void enterName(String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='nom_c']"))); // Replace with the actual ID of the cin field
        nameField.sendKeys(name);
    }

    public void enterPrenom(String prenom) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement prenomField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='prenom_c']"))); // Replace with the actual ID of the cin field
        prenomField.sendKeys(prenom);
    }

    public void enterContact(String contact) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement contactField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='num_tel_c']"))); // Replace with the actual ID of the cin field
        contactField.sendKeys(contact);
    }

    public void enterAddress(String address) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='adresse_c']"))); // Replace with the actual ID of the cin field
        addressField.sendKeys(address);
    }

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='emailc']"))); // Replace with the actual ID of the cin field
        emailField.sendKeys(email);
    }

    public void enterPass(String pass) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='mdp_c']"))); // Replace with the actual ID of the cin field
        passField.sendKeys(pass);
    }


    public void clickDatenaissance() {
        // Click on the date picker field to open the date picker popup
        WebElement datenaissanceField = driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1h9uykw-MuiInputBase-input-MuiOutlinedInput-input\"]"));
        datenaissanceField.click();

    }

    public void enterDate(String date) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
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

    }

    public void selectTypeDeCompte(String value) {
        // Click on the dropdown field to open the dropdown options
        WebElement dropField = driver.findElement(By.xpath("//div[contains(@class,\"css-1cc0o68-MuiInputBase-root-MuiOutlinedInput-root-MuiSelect-root\")] //div[@id=\"simple-select\"]"));
        dropField.click();

        // Locate and click on the option by its text
        WebElement optionToSelect = driver.findElement(By.xpath("//li[@data-value='" + value + "']"));
        optionToSelect.click();
    }

    public void enterPost(String post) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement postField = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r69:-label")));
        postField.sendKeys(post);
    }

    public void enterPole(String post) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement poleField = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r2f:")));
        poleField.sendKeys(post);
    }
   /* public void clickProfilePicture() {
        // Find the file input element
        WebElement image = driver.findElement(By.xpath("//div[@class='MuiBox-root css-gid8lu'] //label[@for='image-uploader']"));

        image.click();
    }*/
  /*  public void clickProfilePicture() {
    driver.findElement(By.xpath("//div[@class='MuiBox-root css-gid8lu'] //label[@for='image-uploader']")).sendKeys("C:\\Users\\takwa chtioui\\OneDrive - GFI\\Images\\Langue.png");
   }}*/

    public void clickProfilePicture() {
        // Find the file input element
        WebElement image = driver.findElement(By.xpath("//div[@class='MuiBox-root css-gid8lu'] //label[@for='image-uploader']"));
        image.click();
    }

    public void clickSubmit() {
        // Find the file input element
        WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/form[1]/div[3]/button[1]"));
        submit.click();
    }



}
