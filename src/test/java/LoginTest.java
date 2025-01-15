import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterUsername("testUser");
        loginPage.enterPassword("testPass");
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isSuccessMessageDisplayed(), "Login should succeed for valid credentials.");
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("wrongPass");
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Login should fail for invalid credentials.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
