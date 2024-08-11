Feature: Home Page

  Scenario: Verify welcome message
    Given I am on the home page
    And I accept the cookies
    When I move mouse over the Devices button from the home page menu bar
    When I click on Smartphones button from the home page menu bar

#    When I click on the Devices button from the home page menu bar
    Then I should see the welcome message "Hello and welcome!"