package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import pages.ItemPage;
import pages.SauceLoginPage;
import pages.SauceVisualPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;

public class SauceDefs {
    WebDriver driver;

    @When("I navigate to the page")
    public void i_navigate_to_the_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("urlSauceDemo");
        driver.get(url);
    }
    @Then("I should submit username and password")
    public void i_should_submit_username_and_password() {
//        WebElement login = driver.findElement(By.id("user-name"));
//        WebElement password = driver.findElement(By.id("password"));
//        WebElement submit = driver.findElement(By.id("login-button"));
//        login.sendKeys("problem_user");
//        password.sendKeys("secret_sauce");
//        submit.click();
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username,password);
    }
    @Then("Print out all item names from page")
    public void print_out_all_item_names_from_page() {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (int i = 0; i < elements.size(); i++) {
            WebElement tempElement = elements.get(i);
            String elementText = tempElement.getText();
            System.out.println(elementText);
//            List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_description"));
//            for (WebElement item : items) {
//                System.out.println(item.getText());
//            }
        }
    }
    @When("I login with locked username and password")
    public void i_login_with_locked_username_and_password() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_locked_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username,password);
    }
    @Then("I should get error message")
    public void i_should_get_error_message() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String error = slp.getErrorMessage();
        System.out.println(error);

    }
    @Then("I login with visual_user")
    public void i_login_with_visual_user() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_visual_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username,password);

    }
    @Then("I should select an item")
    public void i_should_select_an_item() {
        SauceVisualPage sauceVisualPage = new SauceVisualPage(driver);
        sauceVisualPage.item.click();
    }
    @Then("I should print the price and click add to cart")
    public void i_should_print_the_price_and_click_add_to_cart() {
        ItemPage itemPage = new ItemPage(driver);
        String price = itemPage.price.getText();
        System.out.println(price);
        itemPage.addToCart.click();
        itemPage.cartLink.click();
    }

    @Then("I should see {string} item")
    public void i_should_see_backpack_item(String item) {
        SauceVisualPage svp = new SauceVisualPage(driver);

        if (item.equalsIgnoreCase("onesie")){
         boolean isItemDisplayed = svp.item.isDisplayed();
         Assert.assertTrue(isItemDisplayed);
        } else if (item.equalsIgnoreCase("backpack")) {
        boolean isBackpackDisplayed = svp.backpackItem.isDisplayed();
        Assert.assertTrue(isBackpackDisplayed);

        } else {
            Assert.fail("Provided item is not supported yet");
        }

    }
    @Then("price should be {double}")
    public void price_should_be(double price) {
    SauceVisualPage svp = new SauceVisualPage(driver);
    String priceText = svp.onesiePrice.getText();
    System.out.println(priceText.substring(1));
    }



}
