Feature: Invalid UserName and Password Feature

  @regression
  Scenario Outline:Login fails-possible Combinations
    Given  User launch chrome browser open bbc homepage
    When User clicks on Sign in button
    Then user is displayed login screen
    When user enters"<UserName>"in username field
    And user enters "<Password>"in password field
    And user clicks Sign in button
    Then user gets login failed error message


    Examples:
    |UserName |Password |
    |incorrectusername|123456|
    |    Mitkalp      |incorrectPassword|
    |                 |                 |
    | incorrectusername| incorrectPassword|
    |m                 |incorrectPassword |


