Feature: Login

  Scenario: Successfull login
    Given user launches chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and password as "admin"
    When user clicks on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on logout
    Then page title should be "Your store. Login"
    And close browser
