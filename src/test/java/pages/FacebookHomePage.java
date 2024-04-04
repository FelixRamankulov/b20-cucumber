package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
    public FacebookHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    public WebElement usernameField;

    @FindBy(id = "pass")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[text()='The email or mobile number you entered isn’t connected to an account. ']")
    public WebElement error;

    public void loginToFacebook(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}
