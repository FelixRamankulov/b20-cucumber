package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebOrderHomePage {
    public DemoWebOrderHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".custom-control-label")
    public WebElement groupOrderRadioButton;

    @FindBy(id = "ConfirmAddressID")
    public WebElement addressSelect;

    @FindBy(xpath = "//div[text()='2012 EMPIRE BLVD']")
    public WebElement addressPreview;

    @FindBy(id = "getAddressNextButton")
    public WebElement nextButton;

    @FindBy(id = "InviteNote")
    public WebElement inviteNoteField;

    @FindBy(id = "InviteList")
    public WebElement inviteList;

    @FindBy(id = "createGroupOrder")
    public WebElement createGroupOrderButton;

    @FindBy(xpath = "//h1[text()='View Group Order']")
    public WebElement bannerHeader;

    @FindBy(xpath = "//label[text()='Total Participants:']//following-sibling::div")
    public WebElement totalParticipantsReview;



}
