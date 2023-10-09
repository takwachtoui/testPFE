package affectation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project {

    private final WebDriver driver;

    public Project (WebDriver d) {
        this.driver = d;
    }

    public void clickProjectButton() {
        WebElement projectButton = driver.findElement(By.xpath("//li[6]//div[1]//span[2]"));
        projectButton.click();
    }

    public void clickAjoutButton() {
        WebElement ajoutButton = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']"));
        ajoutButton.click();
    }

    public void enterDescription(String description) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement descriptionField = wait.until(ExpectedConditions.elementToBeClickable(By.id("outlined-required")));
        descriptionField.sendKeys(description);
    }

    public void enterTitre(String country) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement titreField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]")));
        titreField.clear();
        titreField.sendKeys(country);
    }

    public void selectClient(String value) {
        // Click on the dropdown field to open the dropdown options
        WebElement dropField = driver.findElement(By.id("simple-select"));
        dropField.click();

        // Locate and click on the option by its text
        WebElement optionToSelect = driver.findElement(By.xpath("//li[@data-value='" + value + "']"));
        optionToSelect.click();
    }

    public void clickSubmit() {
        // Find the file input element
        WebElement submit = driver.findElement(By.xpath("//button[normalize-space()=\"Save\"]"));
        submit.click();
    }



    // Add other AjoutConsultant-related methods here
}
