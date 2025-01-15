package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    // Contact Information

    By firstName_locator = By.name("firstName");
    By lastName_locator = By.name("lastName");
    By phone_locator = By.name("phone");
    By email_locator = By.xpath("//input[@id='userName']");

    // Mailing Information

    By address_locator = By.xpath("//input[@name='address1']");
    By city_locator = By.xpath("//input[@name='city']");
    By state_locator = By.xpath("//input[@name='state']");
    By countrySelect_locator = By.xpath("//select[@name='country']");

    // User Information

    By Username_locator = By.xpath("//input[@id='email']");
    By Password_locator = By.xpath("//input[@name='password']");
    By confirmPassword_locator = By.xpath("//input[@name='confirmPassword']");

    // Submit
    By submitBtn_locator = By.xpath("//input[@name='submit']");

    // Contact Information
    public void setFirstName(String firstName){
        driver.findElement(firstName_locator).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(lastName_locator).sendKeys(lastName);
    }

    public void setPhone(String phone){
        driver.findElement(phone_locator).sendKeys(phone);
    }

    public void setEmail(String email){
        driver.findElement(email_locator).sendKeys(email);
    }

    // Mailing Information
    public void setAddress(String address){
        driver.findElement(address_locator).sendKeys(address);
    }

    public void setCity(String city){
        driver.findElement(city_locator).sendKeys(city);
    }

    public void setState(String state){
        driver.findElement(state_locator).sendKeys(state);
    }

    public void selectCountry(){
        WebElement countrySelect =  driver.findElement(countrySelect_locator);
        Select dropDownCountry = new Select(countrySelect);
        dropDownCountry.selectByIndex(2);
    }

    // User Information
    public void setUsername(String username){
        driver.findElement(Username_locator).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(Password_locator).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPassword_locator).sendKeys(confirmPassword);
    }

    // Submit
    public void submit(){
        driver.findElement(submitBtn_locator).click();
    }











}
