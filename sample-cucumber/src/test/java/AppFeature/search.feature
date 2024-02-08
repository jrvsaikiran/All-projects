@tag
Feature: Amazon search

  @tag1
  Scenario: search product
    Given I have a search field in amazon
    When I search for a product "iphone"
    Then The product will displayed.
