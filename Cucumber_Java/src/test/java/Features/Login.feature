Feature: Login

  Scenario: Successfull login
  Given user launches chrome browser
  When user opens url
  And user enters email and password
  When user clicks on login
  Then page title should be
  When user clicks on logout
  Then page title should be
  And close browser.
  
  Scenario: Successfull login
  Given user launches chrome browser
  When user opens url
  And user enters email "admin@yourstore.com" and password "admin"
  When user clicks on login
  Then page title should be
  When user clicks on logout
  Then page title should be
  And close browser.
  
  
  Scenario Outline: Successfull login
    Given user launches chrome browser
    When user opens url
    And user enters email "<email>" and password "<password>"
    When user clicks on login
    Then page title should be
    When user clicks on logout
    Then page title should be
    And close browser.

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
   
