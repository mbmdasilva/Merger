package com.mergermarkets.test.ui.pages;

import com.mergermarkets.test.ui.support.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends Driver {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(css = ".nav-input")
    private WebElement searchButton;

    @FindBy(css = ".forExpando li:nth-child(4)")
    private WebElement selectMobilePhoneAndSmartPhones;

    @FindBy(css = "img[alt='Sennheiser']")
    private WebElement brandSelectorSennheiser;

    @FindBy(css = "img[alt='iPhone 4s']")
    private WebElement brandSelectorApple;

    @FindBy(css = "img[alt='IPhone']")
    private WebElement brandSelectorIphone;

    @FindBy(css = "ul :nth-child(2).refinementLink:contains('Amazon.co.uk')")
    private WebElement sellerSelector;

    @FindBy(css = "#result_0 .a-link-normal.s-access-detail-page.a-text-normal")
    private WebElement clickFirstItem;

    @FindBy(css = "#sort option:nth-child(3)")
    private WebElement sortByLowToHigh;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }
   //Search for Iphone
    public void searchItem(String item) {
            searchBox.clear();
            searchBox.sendKeys(item);
            searchButton.click();
            wait.until(ExpectedConditions.visibilityOf((selectMobilePhoneAndSmartPhones)));
            selectMobilePhoneAndSmartPhones.click();
            wait.until(ExpectedConditions.visibilityOf((brandSelectorApple)));
            brandSelectorApple.click();
            wait.until(ExpectedConditions.visibilityOf((sortByLowToHigh)));
            sortByLowToHigh.click();
            wait.until(ExpectedConditions.visibilityOf((clickFirstItem)));
            clickFirstItem.click();
        }
   //search for acessory
    public  void searchAccessory(String accessory){
            searchBox.clear();
            searchBox.sendKeys(accessory);
            searchButton.click();
            wait.until(ExpectedConditions.visibilityOf((brandSelectorSennheiser)));
            brandSelectorSennheiser.click();
            wait.until(ExpectedConditions.visibilityOf((clickFirstItem)));
            clickFirstItem.click();
        }

}

