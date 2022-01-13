
Feature: Users should be able to login

  Background:
    Given the user is on the login page


  Scenario: Login as a standard_user
    When the user enters the standard_user information
    Then the user should be able to login

  Scenario:  Login as a locked_out_user
    When the user enters the locked_out_user information
    Then the user should be able to login

  Scenario: Login as a problem_user
    When the user enters the problem_user information
    Then the user should be able to login

  Scenario: Login as a performance_glitch_user
    When the user enters the performance_glitch_user information
    Then the user should be able to login