Feature: Register

  @sanity
  Scenario: User Registration
    Given User Launch browser
    When User opens url "https://awesomeqa.com/ui/"
    And Navigate to Register from Account dropdown
    Then User fill in details for registration
    When User click Continue
    Then Account confirmation page should be displayed

