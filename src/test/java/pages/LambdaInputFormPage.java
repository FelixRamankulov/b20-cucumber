package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaInputFormPage {
    public LambdaInputFormPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "inputEmail4")
    public WebElement emailField;

    @FindBy(id = "inputPassword4")
    public WebElement passwordField;

    @FindBy(id = "company")
    public WebElement companyField;

    @FindBy(id = "websitename")
    public WebElement websiteField;

    @FindBy(xpath = "//select[@name='country']")   // select
    public WebElement countrySelect;

    @FindBy(id = "inputCity")
    public WebElement cityField;

    @FindBy(id = "inputAddress1")
    public WebElement address1Field;

    @FindBy(id = "inputAddress2")
    public WebElement address2Field;

    @FindBy(id = "inputState")
    public WebElement stateField;

    @FindBy(id = "inputZip")
    public WebElement zipField;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

}
