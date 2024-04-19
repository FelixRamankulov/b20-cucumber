Feature: Demo WebOrder
  @DemoWebOrder
  Scenario: office order happy path
    Given user is login page of web order
    When user enters username as 'guest1@microworks.com' and password as 'Guest1!'
    Then user clicks on sign in button
    Given user is on main page user clicks on group order radio button
    Then user selects 'Office' from the dropdown
    And use validates office address as '2012 EMPIRE BLVD'
    Then user leaves note for guests as 'take your shoes off'
    Then user enters info into invitee list as 'test@test.io'
    Then user clicks on create group order button
    And user validates on main header 'View Group Order' on the next page
    And user validates total participant as '1'
