Feature: search and add product to cart


  Background:
    Given User launch browser
    When User opens URL "https://awesomeqa.com/ui/"
    And Navigate to Login from Account dropdown
    Then user inputs username: "francis1234@gmail.com" and password "francis123"
    When User proceeds to Login

  @functional
  Scenario: Search Product
    Then click on search box
    And click search button

  @functional
  Scenario: Add Product to Cart
    When user add product to cart
    Then confirmation alert should be displayed
    Then click on shopping cart icon
    And confirm product in shopping cart
    When user removes product from shopping cart
    Then confirm shopping cart is empty
