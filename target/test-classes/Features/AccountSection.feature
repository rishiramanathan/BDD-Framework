@AccountCreation
Feature: Account Functionality

  Scenario: Create an account
    Given user has opened the Application URL
    When user enters the Username, Email and Password
    Then user clicks on Register button
    Then user can able to see the dashboard
    Then close the driver

  Scenario Outline: Login into the account
    Given user has opened the Application URL
    When user enters "<EmailAddress>" and "<loginpassword>"
    Then user needs clicks on login button
    Then close the browser

    Examples: 
      | EmailAddress       | loginpassword |
      | rishi789@gmail.com | rishi789      |
