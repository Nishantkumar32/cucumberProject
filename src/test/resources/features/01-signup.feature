Feature: Login Functionality

  Background:
    Given user navigates to the login page

  Scenario: Successful login with valid credentials
    When user enters username "student"
    And user enters password "Password123"
    And user clicks on Submit button
    Then  user clicks on link
    And success message should be displayed
    And Logout button should be visible


