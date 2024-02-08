
  Feature: google

  Scenario: open Google
    Given user opened "chrome" browser
    When user enters "https://www.google.co.in" application
    Then user verifies page tiltle "Google"

