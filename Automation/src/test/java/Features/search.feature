
@tag
Feature: Search and place order for vedgetables

  @smokeTest
  Scenario: search for items and validate results
    Given user is on Greencart landing page
    When user searched for Cucumber vedgetable
    Then Cucumber results are displayed

  @seleniumTest
  Scenario Outline: search for items and then move to checkout page
    Given user is on Greencart landing page
    When user searched for <Vedgetable> vedgetable
    Then <Vedgetable> results are displayed
    And added items to cart
    And user proceed to checkout page for purchase
   	Then verify selected <Vedgetable> items are displayed in checkout page
   	
   	 Examples:
      | Vedgetable  |
      | Brinjal 		|
      | Beetroot 		|
  
  