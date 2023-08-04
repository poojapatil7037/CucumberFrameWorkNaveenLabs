Feature: Access Random Data

  Scenario: Get Random Data
    Given I have a data table
      | Name    | Age | Occupation    |
      | Alice   | 25  | Engineer      |
      | Bob     | 30  | Developer     |
      | Charlie | 28  | Designer      |
    When I access random data from the table
    Then I should see the random data displayed
