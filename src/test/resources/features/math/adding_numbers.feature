Feature: Adding Numbers

#  Scenario: Adding two numbers
#    Given a is 1
#    And b is 2
#    When I add a and b
#    Then the total should be 3

  Scenario: Add task
    Given I click add button
    When I input task title and task content
    And I click save button
    Then my task added successfully