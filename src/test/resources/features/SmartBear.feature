Feature: Smart Bear order page

  Background:
    Given I am on SmartBear login page
    Then I login and go to the home page

  Scenario: Making an order
  Then I click "Order" button and selecting a product
  Then I fill out all the bars

  Scenario: Printing out all the orders
    Then I printing the whole list of orders

  Scenario:
    Then I select all the checkboxes and delete the selected

