package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAFoxDesktopPage {


    public QAFoxDesktopPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[text()='iMac']")
    public WebElement iMac;

    @FindBy(css = ".price")
    public WebElement iMacPrice;




}
