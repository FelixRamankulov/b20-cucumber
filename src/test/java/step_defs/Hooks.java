package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BrowserUtils;
import utils.DriverUtils;

public class Hooks {
    //will run before EVERY scenario in any feature file
    @Before
    public void setup(){

        System.out.println("Setup step in Before hook");
    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()){
            BrowserUtils.takeScreenshot(DriverUtils.getDriver("chrome"));
        }
//        DriverUtils.getDriver("chrome").quit();
    }

}
