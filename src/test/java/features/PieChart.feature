
Feature: Verify pie chart screen
  Description: Purpose is to view the pie chart and fetch the Demo1 value.

  @Smoke
  Scenario: Verify the home page
    Given I launch the application
    Then user is on home page

  @Chart
  Scenario: Verify the pie chart screen
    Given I launch the application
    And user opens menu list
    When Click on chart option to open it
    And Click on pie chart
    Then I verify the bar title of pie chart

