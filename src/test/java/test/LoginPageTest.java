package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Utils;
import static org.junit.Assert.assertTrue;


public class LoginPageTest {

    LoginPage loginPage = new LoginPage();
    WebDriver driver = Utils.getDriver();

    @BeforeClass
    public static void setUp() {
        // Set up ChromeDriver with the path to the executable
        ConfigReader.initializeProperties();
        Utils.createDriver();
    }

    @Test
    public void verifyLoginPageUi() {

        loginPage.verifyUsernameField();
        loginPage.verifyPasswordField();


    }

    @AfterClass
    public static void tearDown() {
        // Close the WebDriver
        Utils.quitDriver();
    }
}
