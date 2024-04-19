package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoRegisterPage {
    public DemoRegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "givenName")
    public WebElement givenNameField;
    @FindBy(name = "middleName")
    public WebElement middleNameField;
    @FindBy(name = "familyName")
    public WebElement familyNameField;
    @FindBy(id = "checkbox-unknown-patient")
    public WebElement unknownPatientCheckbox;
    @FindBy(id = "next-button")
    public WebElement nextButton;
    @FindBy(id = "gender-field")
    public WebElement genderSelect;
    @FindBy(id = "birthdateDay-field")
    public WebElement birthDayField;
    @FindBy(id = "birthdateMonth-field")
    public WebElement monthSelect;
    @FindBy(id = "birthdateYear-field")
    public WebElement birthYearField;
    @FindBy(id = "birthdateYears-field")
    public WebElement estimatedYearsField;

    @FindBy(id = "birthdateMonths-field")
    public WebElement estimatedMonthsField;

    @FindBy(id = "address1")
    public WebElement address1Field;

    @FindBy(id = "address2")
    public WebElement address2Field;

    @FindBy(id = "cityVillage")
    public WebElement cityField;

    @FindBy(id = "stateProvince")
    public WebElement stateField;

    @FindBy(id = "country")
    public WebElement countryField;

    @FindBy(id = "postalCode")
    public WebElement postalCodeField;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(id = "relationship_type")
    public WebElement relationshipTypeSelect;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    public WebElement relativeNameField;

    @FindBy(xpath = "//i[@class='icon-plus-sign edit-action']")
    public WebElement plusSignEditActionButton;

    @FindBy(xpath = "//i[@class='icon-minus-sign edit-action']")
    public WebElement minusSignEditActionButton;

    @FindBy(id = "cancelSubmission")
    public WebElement cancelSubButton;

    @FindBy(id = "submit")
    public WebElement confirmSubButton;




}
