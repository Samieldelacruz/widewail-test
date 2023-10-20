package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage{
    @FindBy(id = "email")
    WebElement usernameField;

    @FindBy(id = "Password")
    WebElement passwordField;

    public void verifyUsernameField(){
        assertEquals("Email", usernameField.getAttribute("placeholder"));
    }

    public void verifyPasswordField() {
        assertEquals("Password", passwordField.getAttribute("placeholder"));
    }
}
