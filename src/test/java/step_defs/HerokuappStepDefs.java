package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HerokuappWindowsPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;
import java.util.Set;

public class HerokuappStepDefs {

    WebDriver driver;
    HerokuappWindowsPage herokuappWindowsPage = new HerokuappWindowsPage(driver);

    @When("I navigate to home page")
    public void i_navigate_to_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url");
        driver.get(url);

    }


    @Then("I should see {int} links")
    public void i_should_see_links(int int1) {
        List<WebElement> linkElementList = driver.findElements(By.xpath("//li//a"));
        int linksCount = linkElementList.size();
        Assert.assertEquals(int1,linksCount);
        System.out.println(linksCount);

    }
    @When("I navigate to Checkbox page")
    public void i_navigate_to_checkbox_page() {
       driver = DriverUtils.getDriver("chrome");
       String url = ConfigUtils.getConfigProp("urlCheckboxes");
       driver.get(url);
    }
    @Then("I should get the text of the header and validate it")
    public void i_should_get_the_text_of_the_header() {
        String theHeaderText = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(theHeaderText,"Checkboxes");
        System.out.println(theHeaderText);
    }


    @When("I navigate to windows page")
    public void i_navigate_to_windows_page() {
        String url = ConfigUtils.getConfigProp("herokuapp_windows");
        driver = DriverUtils.getDriver("chrome");
        driver.get(url);
    }
    @When("I click link")
    public void i_click_link() {
    herokuappWindowsPage = new HerokuappWindowsPage(driver);
    herokuappWindowsPage.clickHereLink.click();

    }
    @Then("new tab should open")
    public void new_tab_should_open() {
      Set <String> windowHandles =  driver.getWindowHandles();
      Assert.assertTrue(windowHandles.size()>1);


    }
    @When("I close new tab")
    public void i_close_new_tab() {
      driver.close();

    }
    @Then("I should have {int} tab remaining")
    public void i_should_have_tab_remaining(Integer int1) {

        Set<String> handles = driver.getWindowHandles();
        Assert.assertTrue(handles.size()==1);

    }



    @When("I navigate to Herokuapp home page")
    public void i_navigate_to_herokuapp_home_page() {
        driver = DriverUtils.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/");
    }
    @When("I quit browser")
    public void i_quit_browser() {
    driver.quit();
    }
    @Then("no tabs should be remaining")
    public void no_tabs_should_be_remaining() {
        int count = -1;
        try {
            Set<String> handles = driver.getWindowHandles();
            count = handles.size();
        }catch (Exception ex){
            count = 0;
        }
       Assert.assertTrue(count == 0);
    }




}
