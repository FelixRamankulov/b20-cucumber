package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import smart_bear_pages.SmartBearHomePage;
import smart_bear_pages.SmartBearLoginPage;
import smart_bear_pages.SmartBearOrderPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;

public class SmartBearDefs {

    WebDriver driver;
    @Given("I am on SmartBear login page")
    public void i_am_on_smart_bear_login_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("smart_bear_url");
        driver.get(url);
    }
    @Then("I login and go to the home page")
    public void i_login_and_go_to_the_home_page() {
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage(driver);
        String username = ConfigUtils.getConfigProp("smart_bear_username");
        String password = ConfigUtils.getConfigProp("smart_bear_password");
        smartBearLoginPage.login(username,password);
    }
    @Then("I click {string} button and selecting a product")
    public void i_click_button_and_selecting_an(String string) {
        SmartBearHomePage smartBearHomePage = new SmartBearHomePage(driver);
        smartBearHomePage.orderButton.click();

    }
    @Then("I fill out all the bars")
    public void i_fill_out_all_the_bars() {
        SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage(driver);
        Select select = new Select(smartBearOrderPage.productField);
        select.selectByVisibleText("ScreenSaver");
        smartBearOrderPage.quantityField.clear();
        smartBearOrderPage.quantityField.sendKeys("5");
        smartBearOrderPage.unitPriceFiels.clear();
        smartBearOrderPage.unitPriceFiels.sendKeys("300");
        smartBearOrderPage.discountField.clear();
        smartBearOrderPage.discountField.sendKeys("5");
        smartBearOrderPage.calculateButton.click();

        smartBearOrderPage.customerNameField.sendKeys("CodeFish IT school");
        smartBearOrderPage.streetField.sendKeys("2200 E Devon st");
        smartBearOrderPage.cityField.sendKeys("Des Plaines");
        smartBearOrderPage.stateField.sendKeys("Illinois");
        smartBearOrderPage.zipField.sendKeys("60018");

        smartBearOrderPage.masterCardRadioButton.click();
        smartBearOrderPage.cardNumberField.sendKeys("444993876233");
        smartBearOrderPage.expireDateField.sendKeys("03/24");
        smartBearOrderPage.processButton.click();


    }
    @Then("I printing the whole list of orders")
    public void i_printing_the_whole_list_of_orders_from_the_home_page() {
        SmartBearHomePage smartBearHomePage = new SmartBearHomePage(driver);

        for (WebElement element : smartBearHomePage.elements){
            System.out.println(element.getText());
        }
    }

    @Then("I select all the checkboxes and delete the selected")
    public void i_select_all_the_checkboxes() {
        SmartBearHomePage smartBearHomePage = new SmartBearHomePage(driver);
        List<WebElement> checkboxes = smartBearHomePage.checkboxes;
//        for (WebElement checkbox : checkboxes){
//            checkbox.click();
//        }

        for (int i = 0; i < checkboxes.size(); i++) {
            WebElement tempElement = checkboxes.get(i);
            tempElement.click();
        }

        smartBearHomePage.deleteSelectedButton.click();

    }


}
