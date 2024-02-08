Feature: Customer

  Scenario: Add a new Customer
    Given user launches chrome browser
    When user opens url
    And user enters email "admin@yourstore.com" and password "admin"
    When user clicks on login
    Then User can view Dashboad
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page "Add a new customer back to customer list"
   # When User enter customer info 
    #And click on Save button
    #Then User can view confirmation message "The new customer has been added successfully."
    #And close browser
