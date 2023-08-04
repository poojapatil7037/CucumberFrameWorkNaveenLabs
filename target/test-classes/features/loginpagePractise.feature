Feature: Rahul Shetty login page Practise
  This feature is written for practise purpose

  Scenario: Successfully login with valid login details
    Given User Enters Valid UserName as "poojapatil@gmail.com" and Password "Test@123"
    When User is clicked on Signin button
    Then User should be signin successfully

  Scenario: Successfully login with valid login details
    Given User Enters Valid UserName as "snehapatil@gmail.com" and Password "Test@098"
    When User is clicked on Signin button
    Then User should be signin successfully

  Scenario: User signup with details
    Given User is on Home page
    When User is enters following details
      | Pooja | Patil | pooja@coditas.com | 9012345678 | Pune | Test@1234 |
    And Clicks on signup button
    Then User should be signin successfully
