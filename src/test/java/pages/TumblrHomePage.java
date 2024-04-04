package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TumblrHomePage {
    public TumblrHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Log in']//parent::button")
    public WebElement loginButton;

    @FindBy(xpath = "//button[text()='Continue with email']")
    public WebElement continueWithEmailButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//*[text()='Your email or password were incorrect.']")
    public  WebElement error;



}
