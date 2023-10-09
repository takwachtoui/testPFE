package affectation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Client {

    private final WebDriver driver;

    public Client (WebDriver d) {
        this.driver = d;
    }

    public void clickClientButton() {
        WebElement clientButton = driver.findElement(By.xpath("//li[5]//div[1]//span[2]"));
        clientButton.click();
    }

    public void clickAjoutButton() {
        WebElement ajoutButton = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']"));
        ajoutButton.click();
    }

    public void enterName(String name) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("outlined-required")));
        nameField.sendKeys(name);
    }

    public void enterCountry(String country) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement countryField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]")));
        countryField.clear();
        countryField.sendKeys(country);
    }


    public void enterAdress(String adress) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement adressField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[3]"))); // Replace with the actual ID of the cin field
        adressField.sendKeys(adress);
    }

    public void clickSubmit() {
        // Find the file input element
        WebElement submit = driver.findElement(By.xpath("//button[normalize-space()=\"Save\"]"));
        submit.click();
    }



    // Add other AjoutConsultant-related methods here
}
