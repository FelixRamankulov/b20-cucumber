package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.FormDemoPage;
import pages.LambdaHomePage;
import pages.LambdaInputFormPage;
import utils.DriverUtils;

import java.util.Map;

public class LambdaStepDefs {
    WebDriver driver;
    LambdaHomePage lhp;
    LambdaInputFormPage lifp;

    @Given("I am on lambdatest home page")
    public void i_am_on_lambdatest_home_page() {
        driver = DriverUtils.getDriver("chrome");
        driver.get("https://www.lambdatest.com/selenium-playground/");
    }

    @Then("I click Input Form Submit link")
    public void i_click_input_form_submit_link() {
        lhp = new LambdaHomePage(driver);
        lhp.inputFormSubmitButton.click();

    }

    @Then("I enter all required data in form")
    public void i_enter_all_required_data_in_form() {
        lifp = new LambdaInputFormPage(driver);
        lifp.nameField.sendKeys("Feliks Ramankulov");
        lifp.emailField.sendKeys("feliks123@gmail.com");
        lifp.passwordField.sendKeys("qwerty17");
        lifp.companyField.sendKeys("META");
        lifp.websiteField.sendKeys("SuperTesting");
        Select select = new Select(lifp.countrySelect);
        select.selectByVisibleText("Australia");
        lifp.cityField.sendKeys("Chicago");
        lifp.address1Field.sendKeys("Devon E 2200");
        lifp.address2Field.sendKeys("Waterman E 221 ");
        lifp.stateField.sendKeys("IL");
        lifp.zipField.sendKeys("60005");


    }

    @Then("I click submit")
    public void i_click_submit() {
        lifp = new LambdaInputFormPage(driver);
        lifp.submitButton.click();

    }

    @Then("I validate success message")
    public void i_validate_success_message() {
        FormDemoPage formDemoPage = new FormDemoPage(driver);
        String expectedMessage = "Thanks for contacting us, we will get back to you shortly.";
        String actualMessage = formDemoPage.message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


    }
    @Then("I enter all required data in form with following information")
    public void i_enter_all_required_data_in_form_with_following_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> dataMap = dataTable.asMap();

        lifp = new LambdaInputFormPage(driver);

        String name = dataMap.get("name");
        System.out.println(name);
        lifp.nameField.sendKeys(name);

        String email = dataMap.get("email");
        System.out.println(email);
        lifp.emailField.sendKeys(email);

        String pWord = dataMap.get("password");
        System.out.println(pWord);
        lifp.passwordField.sendKeys(pWord);

        String company = dataMap.get("company");
        System.out.println(company);
        lifp.companyField.sendKeys(company);

        String website = dataMap.get("website");
        System.out.println(website);
        lifp.websiteField.sendKeys(website);

        String country = dataMap.get("country");
        System.out.println(country);

        Select countryDropDown = new Select(lifp.countrySelect);
        countryDropDown.selectByVisibleText(country);

        String city = dataMap.get("city");
        System.out.println(city);
        lifp.cityField.sendKeys(city);

        String address1 = dataMap.get("address1");
        System.out.println(address1);
        lifp.address1Field.sendKeys(address1);

        String address2 = dataMap.get("address2");
        System.out.println(address2);
        lifp.address2Field.sendKeys(address2);

        String state = dataMap.get("state");
        System.out.println(state);
        lifp.stateField.sendKeys(state);

        String zipCode = dataMap.get("zipCode");
        System.out.println(zipCode);
        lifp.zipField.sendKeys(zipCode);

        FormDemoPage formDemoPage = new FormDemoPage(driver);
        formDemoPage.message.getText();



    }



}
