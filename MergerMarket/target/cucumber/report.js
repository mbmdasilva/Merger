$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basket.feature");
formatter.feature({
  "line": 2,
  "name": "Basket",
  "description": "As a  customer I Should be able to search and add items to the basket",
  "id": "basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 479155891,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search for an iPhone and add the cheapest phone to the basket",
  "description": "",
  "id": "basket;search-for-an-iphone-and-add-the-cheapest-phone-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the Amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for \"iphone 6\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I add the cheapest \"iPhone 64GB Unlocked\" to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I assert that the item is added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_StepDef.i_am_on_the_Amazon_page()"
});
formatter.result({
  "duration": 4976946281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone 6",
      "offset": 14
    }
  ],
  "location": "Search_StepDef.i_search_for(String)"
});
formatter.result({
  "duration": 7720227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 64GB Unlocked",
      "offset": 20
    }
  ],
  "location": "Search_StepDef.i_add_the_cheapest_to_the_basket(String)"
});
formatter.result({
  "duration": 229186,
  "status": "passed"
});
formatter.match({
  "location": "Search_StepDef.i_assert_that_the_item_is_added_to_the_basket()"
});
formatter.result({
  "duration": 158042,
  "status": "passed"
});
formatter.after({
  "duration": 125354,
  "status": "passed"
});
});