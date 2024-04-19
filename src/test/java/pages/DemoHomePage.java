package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage {

    public DemoHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    public WebElement usernameField;
    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "Pharmacy")
    public WebElement pharmacyLocation;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(linkText = "Register a patient")
    public WebElement registerPatientLink;
}
