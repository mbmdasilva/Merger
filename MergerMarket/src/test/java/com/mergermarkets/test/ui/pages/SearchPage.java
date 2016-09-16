package com.mergermarkets.test.ui.pages;


import com.mergermarkets.test.ui.support.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchPage extends Driver{

    @FindBy (css=".pagnCur")
    private WebElement pageCount;

    @FindBy (css="#sort option:nth-child(4)")
    private WebElement sortByLowToHigh;

    @FindBy(css="#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(css="nav-search-submit-text" )
    private WebElement searchButton;


    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void searchBox(String item){
        searchBox.clear();
        searchBox.sendKeys(item);
    }
    public void sortByLowToHigh(){
        sortByLowToHigh.click();
    }
    public void clickSearchButton(){
        searchButton.click();
    }


}


fill_in 'twotabsearchtextbox', :with => item
        end

        def click_go
        click_button("Go")[0]
        end


        def show_smartphones
        click_link('Pay Monthly Mobile Phones & Smartphones')
        end

        def item_value
        page.find('#result_0 .a-size-base.a-color-price')
        end

        def select_item
        page.find('#result_0 .a-link-normal.s-access-detail-page.a-text-normal')
        end

        def item_amount
        page.find('#result_0 .a-column.a-span7 .a-row.a-spacing-none .a-link-normal.a-text-normal')
        end
