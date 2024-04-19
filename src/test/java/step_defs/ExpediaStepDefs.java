package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverUtils;

public class ExpediaStepDefs {

    private WebDriver driver;

    @When("I navigate to expedia home page")
    public void i_navigate_to_expedia_home_page() {
        driver = DriverUtils.getDriver("chrome");
        driver.get("https://www.expedia.com/");
    }


    @Then("I validate home page title")
    public void i_validate_home_page_title() {
        String pageTitle = driver.getTitle();
        String expectedTitle = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";
        Assert.assertEquals(pageTitle,expectedTitle);
    }

}
