Feature: Verify list view functionality
  Purpose is to verify the list view features of the application

  Background:
    Given user opens the application
    When user is on home page
    And user opens menu list
    Then user navigates to ListView page
    And user is on ListView page


  @List
  Scenario: Verifying searchable functionality
    When user clicks on Searchable ListView button
    And user enter <country> name
    Then user check the searched result


  @List @Gesture
  Scenario: Verifying Pull To Refresh functionality
    When user clicks on Pull To Refresh button
    And User pull to refresh the list on the page
    Then user check the NEW ITEM ADDED text