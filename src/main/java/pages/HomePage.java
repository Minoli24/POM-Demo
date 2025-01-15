package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By registerBtn_locator = By.linkText("REGISTER"); // Locate Element

    public void selectRegisterMenu(){
        driver.findElement(registerBtn_locator).click();

    }
}
