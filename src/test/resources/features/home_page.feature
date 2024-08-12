Feature: Home Page

  Scenario: Verify welcome message
    Given I am on the home page
    And I accept the cookies
    Then I verify if browser is opened
    When I move mouse over the Devices button from the home page menu bar
    Then I verify if Submenu is displayed
    And I click on Smartphones button from the home page menu bar
    Then I verify if url contains "telefony" text
    When I select the first product from the list
    Then I verify if url contains "urzadzenie" text
    When I note the start price value
    And  I note the monthly price value
    When I click on the Add to cart button
    Then I verify if I am redirected to the cart page




#    When I click on the Devices button from the home page menu bar
    Then I should see the welcome message "Hello and welcome!"