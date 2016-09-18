package com.mergermarkets.test.ui.pages;

import com.mergermarkets.test.ui.support.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class BasketPage extends Driver {

    @FindBy(css = "#add-to-cart-button")
    private WebElement addBasket;
    @FindBy(css = "#add-to-cart-button-ubb")
    private WebElement addToBasket;

    @FindBy(css = "#hlb-view-cart-announce")
    private WebElement editBasket;
    @FindBy(css = ".a-size-medium.a-color-price.sc-price.sc-white-space-nowrap.sc-product-price.sc-price-sign.a-text-bold")
    private WebElement getPrice;
    @FindBy(css = ".a-size-medium.a-color-price.sc-price.sc-white-space-nowrap.sc-price-sign")
    private WebElement subTotalBasket;

    @FindBy(css = ".a-size-medium.a-color-price.sc-price.sc-white-space-nowrap.sc-product-price.sc-price-sign.a-text-bold")
    private WebElement getPriceTwo;

    protected static String subTotal;
    protected static String priceOne;
    protected static String priceTwo;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public BasketPage() {
        PageFactory.initElements(driver, this);
    }

    public void addItemToBasket(String item) {
        if (item.contains("IPhone 4s")) {
            wait.until(ExpectedConditions.visibilityOf((addToBasket)));
            addToBasket.click();
        } else {
            wait.until(ExpectedConditions.visibilityOf(addBasket));
            addBasket.click();
        }
    }

    public void editBasket() {
        editBasket.click();
    }
  //Assertion for when basket is updated with IPhone
    public void assertBasketUpdated() {
        editBasket();
        subTotal = subTotalBasket.getText();
        priceOne = getPrice.getText();
        assertThat(subTotal, containsString(priceOne));

    }
  //Assertion for when the basket is updated with accessory after it has an Iphone
    public void assertBasketTotal() {
        editBasket();

        priceOne = priceOne.trim();
        priceOne = priceOne.replaceAll("[^\\d.]", "");

        priceTwo = getPriceTwo.getText();
        priceTwo.trim();
        priceTwo = priceTwo.replaceAll("[^\\d.]", "");

        subTotal = subTotalBasket.getText();
        subTotal = subTotal.replaceAll("[^\\d.]", "");

        String total;
        double price1 = Double.parseDouble(priceOne);
        double price2 = Double.parseDouble(priceTwo);
        total = String.valueOf((price1 + price2));
        assertThat(subTotal, containsString(total));
    }

}
