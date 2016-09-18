= Amazon Cucumber Test Suite

== Introduction

Create a simple project using any open source tools, to test the following:

1. Go to Amazon and search for an iPhone and add the cheapest phone to the basket.

2. Verify it was added.

3. Add an iPhone accessory to the basket.

4. Verify the total price is as expected.


== Project Layout



com.mergermarkets.test.ui.cucumber : Cucucmber classes RunCkes and Hook

com.mergermarkets.test.ui.stepdefinitions : The step definiton Class

com.mergermarkets.test.ui.support :Driver initialization and Launch the page

com.mergermarkets.test.ui.pages : The Basket and Search pages

src/test/resources/features : Where the feature file with scenarios resides

== Prerequisites

Firefox version 43.0 (Been having some issues with driver version 2.53.1 and FF driver 48 the version 43 seems most reliable)

