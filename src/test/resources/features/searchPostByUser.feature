@posts
Feature: Search for a particular User

  Scenario: Search for User Delphine
    Given I search for user "Delphine"
    Then I search for user post by user "Delphine"