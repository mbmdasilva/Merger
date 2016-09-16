package com.mergermarkets.test.ui.stepdefinitions;

import com.mergermarkets.test.ui.support.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Basket_StepDef {

    @Given("^I am on the Amazon page$")
    public void i_am_on_the_Amazon_page(){
        Driver.navigateToPage();

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String item) {

    }

    @When("^I add the cheapest \"([^\"]*)\" to the basket$")
    public void i_add_the_cheapest_to_the_basket(String item) {

    }

    @Then("^I assert that the item is added to the basket$")
    public void i_assert_that_the_item_is_added_to_the_basket(){

    }

    @When("^I add \"([^\"]*)\" to my basket$")
    public void i_add_to_my_basket(String item)  {

    }

    @Then("^I assert the basket total has been updated$")
    public void i_assert_the_basket_total_has_been_updated(){

    }

}
