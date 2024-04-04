Feature: Lambda fill out

  Scenario: filling out input forms
    Given I am on lambdatest home page
    Then I click Input Form Submit link
    Then I enter all required data in form
    Then I click submit
    Then I validate success message


  Scenario: filling out input forms
    Given I am on lambdatest home page
    Then I click Input Form Submit link
    Then I enter all required data in form with following information
      | name     | John          |
      | email    | jc@gmail.com  |
      | password | myFavPass     |
      | company  | Codefish      |
      | website  | Codefish.io   |
      | country  | United States |
      | city     | Des Plaines   |
      | address1 | 2200 E Devon  |
      | address2 | 351           |
      | state    | IL            |
      | zipCode  | 60018         |
    Then I click submit
    Then I validate success message

