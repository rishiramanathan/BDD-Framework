@ListOfTheProducts
Feature: Upadate Cart

  @RegressionSuite
  Scenario: Selection of Multiple products and clicking on Update Cart
    Given user has opened the Application URL
    And user has selected multiple products
    When user click on View Cart
    Then system should navigated to Cart section
    And user  should be able to see all the selected products
    Then user click on proceed to checkout
    Then close the driver
