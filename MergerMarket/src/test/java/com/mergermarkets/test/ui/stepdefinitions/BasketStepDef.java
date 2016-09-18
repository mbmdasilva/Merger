package com.mergermarkets.test.ui.stepdefinitions;

import com.mergermarkets.test.ui.pages.BasketPage;
import com.mergermarkets.test.ui.pages.SearchPage;
import com.mergermarkets.test.ui.support.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketStepDef {
    SearchPage searchPage = new SearchPage();
    BasketPage basketPage = new BasketPage();

    @Given("^I am on the Amazon page$")
    public void i_am_on_the_Amazon_page() {
        Driver.navigateToPage();
    }

    @When("^I search for the cheapest \"([^\"]*)\"$")
    public void i_search_for_the_cheapest(String item)  {
        searchPage.searchItem(item);

    }

    @When("^I add \"([^\"]*)\" to the basket$")
    public void i_add_to_the_basket(String item) {
        basketPage.addItemToBasket(item);

    }


    @Then("^I assert the basket has been updated$")
    public void i_assert_the_basket_has_been_updated(){
        basketPage.assertBasketUpdated();

    }

    @Then("^I assert the total amount in the basket$")
    public void i_assert_the_total_amount_in_the_basket() {
        basketPage.assertBasketTotal();

    }

}
