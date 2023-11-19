Feature: user login

  Scenario Outline: user can login with valid username and password
    Given user is in login page
    When user enters valid username <username> and password <password>
    And user clicks on login button
    Then user login successfully
    Examples:
      | username               | password     |
      | "testregister@aaa.com" | "Wakram_123" |

