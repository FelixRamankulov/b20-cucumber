Feature: Demo register

  Scenario Outline:  entering all required information

    Given I am on demo page
    Then I enter "<username>" username
    Then I enter "<password>" password
    Then I choose pharmacy location
    Then I click register new patient
    Then I pass all required data in form with following information

      | given name   | Feliks                 |
      | family name  | Ramankulov             |
      | dayOfBirth   | 17                     |
      | yearOfBirth  | 2000                   |
      | address1     | 525 S Cleveland Avenue |
      | city         | Arlington Heights      |
      | state        | IL                     |
      | country      | USA                    |
      | postal code  | 60005                  |
      | phone number | 2244603238             |

    Examples:
      | username | password |
      | admin    | Admin123 |
