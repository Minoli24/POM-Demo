package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {

    WebDriver driver;

    public RegisterSuccessPage(WebDriver driver){
        this.driver = driver;
    }

    By successText_locator = By.xpath("//b[contains(text(),'Dear')]");

    public String registerSuccessText(){
         String successText = driver.findElement(successText_locator).getText();
         return successText;
    }


}
