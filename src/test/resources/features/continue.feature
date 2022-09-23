Feature: continue
  Scenario: User want to back to Products Page
    Given User already login
    And User already add a different product to cart
    When User clicked Cart icon
    And Directed to Cart Page
    And User click on continue shopping button
    Then I redirected to inventory page