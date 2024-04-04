package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.TumblrHomePage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class TumblrDefs {
    private WebDriver driver;

    @Given("I am on Tumblr home page")
    public void i_am_on_tumblr_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String  url = ConfigUtils.getConfigProp("tumblr_url");
        driver.get(url);
    }
    @When("click login button")
    public void click_login_button() {
        TumblrHomePage thp = new TumblrHomePage(driver);
        thp.loginButton.click();

    }
    @When("I click continue with email")
    public void i_click_continue_with_email() {
        TumblrHomePage thp = new TumblrHomePage(driver);
        thp.continueWithEmailButton.click();

    }
    @When("I enter {string} email")
    public void i_enter_email(String email) {
        TumblrHomePage thp = new TumblrHomePage(driver);
        thp.emailField.sendKeys(email + Keys.ENTER);
    }
    @When("I enter {string} passwords")
    public void i_enter_passwords(String password) {
        TumblrHomePage thp = new TumblrHomePage(driver);
        thp.passwordInputField.sendKeys(password + Keys.ENTER);



    }
    @Then("I should get {string} error")
    public void i_should_get_error(String expectedError) {
        TumblrHomePage thp = new TumblrHomePage(driver);
        String actualError = thp.error.getText();
        Assert.assertEquals(expectedError,actualError);
    }
}
