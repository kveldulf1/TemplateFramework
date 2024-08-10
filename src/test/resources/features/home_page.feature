Feature: Home Page

  Scenario: Verify welcome message
    When I open the home page
    Then I should see the welcome message "Hello and welcome!"