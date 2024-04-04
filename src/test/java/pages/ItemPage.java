package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    public ItemPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//div[@data-test='inventory-item-price']")
    public WebElement price;

    @FindBy(id = "add-to-cart")
    public WebElement addToCart;

    @FindBy(id = "shopping_cart_container")
    public WebElement cartLink;


}
