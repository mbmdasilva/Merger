@search
Feature: Basket
  As a  customer I Should be able to search and add items to the basket

 Scenario: Add Cheapest IPhone to the basket
    Given I am on the Amazon page
    When I search for the cheapest "IPhone 4s"
    And I add "IPhone 4s" to the basket
    Then I assert the basket has been updated


  Scenario: Add an iPhone accessory to the basket
    Given I am on the Amazon page
    And  I search for the cheapest "iPhone accessory"
    When I add "iPhone accessory" to the basket
    Then I assert the total amount in the basket
