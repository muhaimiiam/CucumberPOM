Feature: Login

  Scenario Outline: Verify that user is able to login
    Given User opens browser
    When User is on login page
    Then User logged in
    Then User click on sign in button
    Then Home page is displayed