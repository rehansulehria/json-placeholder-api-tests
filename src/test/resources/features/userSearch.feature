@users
Feature: Search for a particular User
  Scenario: Search for User Delphine
    Given I search for user "Delphine"
    Then User "Delphine" is returned in response