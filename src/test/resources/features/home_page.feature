Feature: End to end test for adding a product to the cart

  @dependencyInjection
  Scenario: Add to cart, verify prices, navigate to home page and verify whether cart icon displays that there is a product in the cart
    Given I am on the home page
    And I accept the cookies
    Then I verify if browser is opened
    When I move mouse over the Devices button from the home page menu bar
#    Then I verify if Submenu is displayed
#    And I click on Smartphones button from the home page menu bar
#    Then I verify if url contains "telefony" text
#    When I select the first product from the list
#    Then I verify if url contains "urzadzenie" text
#    When I note the start price value
#    And  I note the monthly price value
#    When I click on the Add to cart button
#    Then I verify if I am redirected to the basket page
#    And I verify if the start price value is the same as the one noted
#    And I verify if the total price value is the same as the one noted
