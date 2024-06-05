Feature: Verify Pop up functionality
  Description: Purpose is to verify the pop-up functionality in the application

  @Popup
  Scenario: Verifying pop-up menu features
    Given user opens the application
    When user is on home page
    And user opens menu list
    And user navigates to pop up screen
    Then user is on popUp screen
    And user clicks on popUp Menu button
    And user clicks on show popUp Menu button
    Then user checks the popUp menu action buttons