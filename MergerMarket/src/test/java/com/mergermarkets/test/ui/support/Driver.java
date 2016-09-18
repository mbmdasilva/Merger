package com.mergermarkets.test.ui.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {

    public static WebDriver driver;

    public static void navigateToPage() {
        driver.get("https://www.amazon.co.uk");
    }

    public static void initialiseDriver() {
        driver = new FirefoxDriver();
    }

    public static void quitDriver() {

        driver.quit();
    }

}
