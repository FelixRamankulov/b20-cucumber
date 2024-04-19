package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebOrderLoginPage {

    public DemoWebOrderLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;










}
