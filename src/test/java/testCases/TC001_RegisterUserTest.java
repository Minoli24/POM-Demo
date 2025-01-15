package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;

public class TC001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001(){

        // Home Page
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();

        // Register Page
        RegisterPage registerPage = new RegisterPage(driver);
        // Contact Information
        registerPage.setFirstName("Minoli");
        registerPage.setLastName("Rashmitha");
        registerPage.setPhone("0706959277");
        registerPage.setEmail("minoli@gmail.com");

        // Mailing Information
        registerPage.setAddress("No 190, Welivita Rd");
        registerPage.setCity("Malabe");
        registerPage.setState("Western");
        registerPage.selectCountry();

        // User Information
        registerPage.setUsername("Minoli");
        registerPage.setPassword("123");
        registerPage.setConfirmPassword("123");

        // Submit
        registerPage.submit();

        // Register Success Page
        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText = registerSuccessPage.registerSuccessText();

        Assert.assertTrue(actualText.contains("Dear"),"Registration Failed!!");

    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
