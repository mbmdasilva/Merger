$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basket.feature");
formatter.feature({
  "line": 2,
  "name": "Basket",
  "description": "As a  customer I Should be able to search and add items to the basket",
  "id": "basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 558921325,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add Cheapest IPhone to the basket",
  "description": "",
  "id": "basket;add-cheapest-iphone-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the Amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for the cheapest \"IPhone 4s\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I add \"IPhone 4s\" to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I assert the basket has been updated",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketStepDef.i_am_on_the_Amazon_page()"
});
formatter.result({
  "duration": 8529626271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IPhone 4s",
      "offset": 27
    }
  ],
  "location": "BasketStepDef.i_search_for_the_cheapest(String)"
});
formatter.result({
  "duration": 12425623526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IPhone 4s",
      "offset": 7
    }
  ],
  "location": "BasketStepDef.i_add_to_the_basket(String)"
});
formatter.result({
  "duration": 3435774497,
  "status": "passed"
});
formatter.match({
  "location": "BasketStepDef.i_assert_the_basket_has_been_updated()"
});
formatter.result({
  "duration": 3311593804,
  "status": "passed"
});
formatter.after({
  "duration": 101316,
  "status": "passed"
});
formatter.before({
  "duration": 38562527,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add an iPhone accessory to the basket",
  "description": "",
  "id": "basket;add-an-iphone-accessory-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am on the Amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search for the cheapest \"iPhone accessory\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I add \"iPhone accessory\" to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I assert the total amount in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketStepDef.i_am_on_the_Amazon_page()"
});
formatter.result({
  "duration": 74754169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone accessory",
      "offset": 27
    }
  ],
  "location": "BasketStepDef.i_search_for_the_cheapest(String)"
});
formatter.result({
  "duration": 10967983799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone accessory",
      "offset": 7
    }
  ],
  "location": "BasketStepDef.i_add_to_the_basket(String)"
});
formatter.result({
  "duration": 3444306195,
  "status": "passed"
});
formatter.match({
  "location": "BasketStepDef.i_assert_the_total_amount_in_the_basket()"
});
formatter.result({
  "duration": 3032231535,
  "status": "passed"
});
formatter.after({
  "duration": 50366,
  "status": "passed"
});
});