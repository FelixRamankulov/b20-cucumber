Feature: Google Search
  @smokeTest
  Scenario: Happy path search
    Given I am on google home page
    When I search for Codefish
    Then I should get results
