package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Utils;

public class BasePage {
    WebDriver driver = Utils.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
