package smart_bear_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {
    public SmartBearOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productField;  //select

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement unitPriceFiels;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement totalField;

    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculateButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetField;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement cityField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCardRadioButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpressRadioButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDateField;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//input[@type='reset']")
    public WebElement resetButton;


}
