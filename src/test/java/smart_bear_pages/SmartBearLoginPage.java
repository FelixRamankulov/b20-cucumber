package smart_bear_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
    public SmartBearLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#ctl00_MainContent_username")
    public WebElement usernameField;

    @FindBy(css = "#ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
