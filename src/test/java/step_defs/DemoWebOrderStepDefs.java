package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.DemoWebOrderHomePage;
import pages.DemoWebOrderLoginPage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class DemoWebOrderStepDefs {

    private WebDriver driver;
    private DemoWebOrderLoginPage demoWebOrderLoginPage;
    private DemoWebOrderHomePage demoWebOrderHomePage;
    @Given("user is login page of web order")
    public void user_is_login_page_of_web_order() {
       driver = DriverUtils.getDriver("chrome");
       String url = ConfigUtils.getConfigProp("webOrder_url");
       driver.get(url);
    }
    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
        demoWebOrderLoginPage = new DemoWebOrderLoginPage(driver);
//        demoWebOrderHomePage.username.sendKeys(username);
//        demoWebOrderHomePage.password.sendKeys(password);


    }
    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        demoWebOrderLoginPage.submitButton.click();
    }
    @Given("user is on main page user clicks on group order radio button")
    public void user_is_on_main_page_user_clicks_on_group_order_radio_button() {
        demoWebOrderHomePage = new DemoWebOrderHomePage(driver);
        demoWebOrderHomePage.groupOrderRadioButton.click();


    }
    @Then("user selects {string} from the dropdown")
    public void user_selects_from_the_dropdown(String address) {
        Select select = new Select(demoWebOrderHomePage.addressSelect);
        select.selectByVisibleText(address);

    }
    @Then("use validates office address as {string}")
    public void use_validates_office_address_as(String addressSelect) {
       String address = demoWebOrderHomePage.addressPreview.getText();
        System.out.println(address);
        Assert.assertTrue(address.contains(addressSelect));
        demoWebOrderHomePage.nextButton.click();
    }
    @Then("user leaves note for guests as {string}")
    public void user_leaves_note_for_guests_as(String note) {
        demoWebOrderHomePage.inviteNoteField.sendKeys(note);

    }
    @Then("user enters info into invitee list as {string}")
    public void user_enters_info_into_invitee_list_as(String info) {
        demoWebOrderHomePage.inviteList.sendKeys(info);


    }
    @Then("user clicks on create group order button")
    public void user_clicks_on_create_group_order_button() {
        demoWebOrderHomePage.createGroupOrderButton.click();
    }
    @Then("user validates on main header {string} on the next page")
    public void user_validates_on_main_header_on_the_next_page(String header) {
       String headerText = demoWebOrderHomePage.bannerHeader.getText();
       System.out.println(headerText);
       Assert.assertEquals(header,headerText);
    }
    @Then("user validates total participant as {string}")
    public void user_validates_total_participant_as(String participants) {
      String totalParticipantsText = demoWebOrderHomePage.totalParticipantsReview.getText();
        System.out.println(totalParticipantsText);
        Assert.assertEquals(totalParticipantsText,participants);

    }


}
