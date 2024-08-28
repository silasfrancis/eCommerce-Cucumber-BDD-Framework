Feature: Login


  Background: Common steps
    Given User launch browser
    When User opens URL "https://awesomeqa.com/ui/"
    And Navigate to Login from Account dropdown

  @functional
  Scenario: User Login
    Then user inputs username: "francis1234@gmail.com" and password "francis123"
    When User proceeds to Login
    Then A page showing "My Account" should be displayed
    And User Logout
    And Logout Confirmation should be displayed

  @regression
  Scenario Outline: User Login
    Then user inputs username: "<email>" and password "<password>"
    When User proceeds to Login
    Then A page showing "My Account" should be displayed
    And User Logout
    And Logout Confirmation should be displayed

    Examples:
    | email | password |
    | francis1234@gmail.com | francis123 |
    | francis@admin.com | passfrank123 |
    | email@email.com | frankpass123 |
    | francis1234@gmail.com | francis123 |



