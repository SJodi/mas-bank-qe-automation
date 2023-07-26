@Todo
Feature: Todo

# Add to-do
  Scenario: User adds a new to-do
    Given I am on the to-do list page
    When I enter "Buy groceries" in the new to-do field
    And I click the enter button
    Then I should see "Buy groceries" in my to-do list

# Complete to-do
  Scenario: User completes a to-do
    Given I have "Buy groceries" in my to-do list
    When I click the checkbox next to "Buy groceries"
    Then "Buy groceries" should be marked as completed

# Filter to-dos
  Scenario: User filters active to-dos
    Given I have to-dos "Buy groceries" and "Pay bills"
    And "Pay bills" is completed
    When I filter for active to-dos
    Then I should only see "Buy groceries"

# Delete to-do
  Scenario: User deletes a to-do
    Given I have "Buy groceries" in my to-do list
    When I click the delete button for "Buy groceries"
    Then "Buy groceries" should be removed from my to-do list