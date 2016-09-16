
Feature: Basket
  As a  customer I Should be able to search and add items to the basket

  @search
 Scenario: Search for an iPhone and add the cheapest phone to the basket

    Given I am on the Amazon page
    When I search for "iphone 6"
    And  I add the cheapest "iPhone 64GB Unlocked" to the basket
    Then I assert that the item is added to the basket


  Scenario: Add an iPhone accessory to the basket
    Given I am on the Amazon page
    When I add "iPhone accessory" to my basket
    Then I assert the basket total has been updated
