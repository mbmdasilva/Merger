package com.mergermarkets.test.ui.pages;

import com.mergermarkets.test.ui.support.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage  extends Driver{

    @FindBy(css = "#result_0 .s-access-image.cfMarker")
    private WebElement selectFirstItem;

    @FindBy(css = "#add-to-cart-button")
    private WebElement addToBasket;

    @FindBy(css = "#nav-cart-count")
    private WebElement basketTotal;

    public BasketPage(){
        PageFactory.initElements(driver, this);}

    public void addItems(String item){


    }
}
