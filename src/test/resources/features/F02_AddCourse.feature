Feature: add course

  Scenario Outline: user can add a new course
    Given user is logged in on the courses page
    When user clicks on add course button
    And user fills course info <courseName> <gradeValue>
    And user clicks on create button
    Then a new course <courseName> should added successfully
    Examples:
      | courseName                   | gradeValue  |
      | "Marianne Ebaid Course Test" | "number:14" |
