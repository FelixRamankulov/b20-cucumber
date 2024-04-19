package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.DemoHomePage;
import pages.DemoRegisterPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.Map;

public class DemoStepDefs {


    WebDriver driver;
    DemoHomePage dhp;
    DemoRegisterPage drp;

    @Given("I am on demo page")
    public void i_am_on_demo_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("demo_url");
        driver.get(url);
    }

    @Then("I enter {string} username")
    public void i_enter_username(String username) {
        dhp = new DemoHomePage(driver);
        dhp.usernameField.sendKeys(username);
    }

    @Then("I enter {string} password")
    public void i_enter_password(String password) {
        dhp = new DemoHomePage(driver);
        dhp.passwordField.sendKeys(password);
    }

    @Then("I choose pharmacy location")
    public void i_choose_pharmacy_location() {
        dhp = new DemoHomePage(driver);
        dhp.pharmacyLocation.click();
        dhp.loginButton.click();
    }

    @Then("I click register new patient")
    public void i_click_register_new_patient() {
        dhp = new DemoHomePage(driver);
        dhp.registerPatientLink.click();
    }

    @Then("I pass all required data in form with following information")
    public void i_pass_all_required_data_in_form_with_following_information(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> dataMap = dataTable.asMap();

        drp = new DemoRegisterPage(driver);

        String givenName = dataMap.get("given name");
        drp.givenNameField.sendKeys(givenName);

        String familyName = dataMap.get("family name");
        drp.familyNameField.sendKeys(familyName);

        drp.nextButton.click();

        Select select = new Select(drp.genderSelect);
        select.selectByValue("M");

        drp.nextButton.click();

        String dayOfBirth = dataMap.get("dayOfBirth");
        drp.birthDayField.sendKeys(dayOfBirth);

        select = new Select(drp.monthSelect);
        select.selectByValue("10");

        String yearOfBirth = dataMap.get("yearOfBirth");
        drp.birthYearField.sendKeys(yearOfBirth);

        drp.nextButton.click();

        String address1 = dataMap.get("address1");
        drp.address1Field.sendKeys(address1);

        String city = dataMap.get("city");
        drp.cityField.sendKeys(city);

        String state = dataMap.get("state");
        drp.stateField.sendKeys(state);

        String country = dataMap.get("country");
        drp.countryField.sendKeys(country);

        String postalCode = dataMap.get("postal code");
        drp.postalCodeField.sendKeys(postalCode);

        drp.nextButton.click();

        String phoneNumber = dataMap.get("phone number");
        drp.phoneNumberField.sendKeys(phoneNumber);

        drp.nextButton.click();
        drp.nextButton.click();
        drp.confirmSubButton.click();







    }

}
