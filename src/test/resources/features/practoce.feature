Feature: Practice Page Navigation

  Scenario: Navigate to Test Exceptions from Practice
    Given user is on the homepage
    When user clicks on "Practice" link
    And "Test Exceptions" link is displayed
    And user clicks on "Test Exceptions" link
    Then user should be navigated to the Test Exceptions page