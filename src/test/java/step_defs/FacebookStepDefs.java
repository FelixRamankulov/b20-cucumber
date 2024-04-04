package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.FacebookHomePage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class FacebookStepDefs {
    private WebDriver driver;
    private FacebookHomePage fhp;

    @Given("I am on facebook home page")
    public void i_am_on_facebook_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("facebook_url");
        driver.get(url);
    }

    @Then("I fill the {string} username field out")
    public void i_fill_the_username_field_out(String username) {
        fhp.usernameField.sendKeys(username);
    }

    @Then("I  fill the {string} password field out")
    public void i_fill_the_password_field_out(String password) {
        fhp.passwordField.sendKeys(password + Keys.ENTER);

    }

    @Then("I should get {string} message")
    public void i_should_get_message(String error) {
        String actualError = fhp.error.getText();
        Assert.assertTrue(actualError.contains(error));
    }

}
