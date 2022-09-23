Feature: search
  Scenario: Sorting product name Z to A
    Given User already login
    And User already add a product to cart
    When User click sorting field
    And User click Name Z to A
    Then Product should be sorted by name Z to A