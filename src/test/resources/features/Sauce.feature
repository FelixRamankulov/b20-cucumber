Feature: User log in

  Background:
    When I navigate to the page

  Scenario: Navigating to the page and log in
    Then I should submit username and password
    Then Print out all item names from page

  Scenario: Login with locked user
    When I login with locked username and password
    Then I should get error message

  Scenario: Selecting an item and sending it to the cart
    Then I login with visual_user
    Then I should select an item
    Then I should print the price and click add to cart

  Scenario: Login with visual user
    Then I login with visual_user
    Then I should see "onesie" item
    And price should be 7.99




