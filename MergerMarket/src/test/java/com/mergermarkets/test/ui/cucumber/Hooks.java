package com.mergermarkets.test.ui.cucumber;

import com.mergermarkets.test.ui.support.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;


public class Hooks extends Driver {

    protected static Logger log;

    @Before
    public void beforeScenario() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            embedScreenshot(scenario);
        }
    }

    private void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "image/png");
            } catch (WebDriverException e) {
                log.error("Sorry due to some problem cannot take screen shot now" + System.lineSeparator());
            }
        }
    }
}

