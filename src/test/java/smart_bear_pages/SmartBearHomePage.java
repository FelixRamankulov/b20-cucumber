package smart_bear_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearHomePage {
    public SmartBearHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Order")
    public WebElement orderButton;

    @FindBy(xpath = "//tbody//tbody")
    public List<WebElement> elements;

    @FindBy(css = "#ctl00_MainContent_btnDelete")
    public WebElement deleteSelectedButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxes;

    @FindBy(css = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllButton;

    @FindBy(css = "#ctl00_MainContent_btnUncheckAll")
    public WebElement uncheckAllButton;

}
