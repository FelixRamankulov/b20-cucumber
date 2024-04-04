Feature: Facebook log in

  Scenario Outline: Invalid login
    Given I am on facebook home page
    Then I fill the "<username>" username field out
    And I  fill the "<password>" password field out
    Then I should get "<error>" message

    Examples:
      | username      | password | error                                                                                               |
      | 231gah3vbmnfa | nnnnsknn | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |







