@smokeTest @positive @negative
Feature: The internet herokuapp
  Scenario: Validate links on home page
    When I navigate to home page
    Then I should see 44 links

    Scenario: Validate the header of the Checkbox page
      When I navigate to Checkbox page
      Then I should get the text of the header and validate it

    @closeTab
    Scenario: Open and close a new tab
      When I navigate to windows page
      And I click link
      Then new tab should open
      When I close new tab
      Then I should have 1 tab remaining

    @quit
    Scenario: Quit browser
      When I navigate to Herokuapp home page
      And I quit browser
      Then no tabs should be remaining



