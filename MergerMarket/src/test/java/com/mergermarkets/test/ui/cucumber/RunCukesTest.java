package com.mergermarkets.test.ui.cucumber;

import com.mergermarkets.test.ui.support.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true,
        tags = {"@search"},
        features = "src/test/resources/features",
        format = {"html:target/cucumber"},
        glue = {"com.mergermarkets.test.ui.cucumber",
                "com.mergermarkets.test.ui.stepdefinitions",
                "com.mergermarkets.test.ui.support",
                "com.mergermarkets.test.ui.pages"})

public class RunCukesTest {

    @BeforeClass
    public static void setup() {
        Driver.initialiseDriver();
    }

    @AfterClass

    public static void teardown() {
        Driver.quitDriver();
    }
}