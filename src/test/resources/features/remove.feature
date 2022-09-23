Feature: remove
  Scenario: Remove items from Cart
    Given User already login
    And User Already have two items in chart
    When User clicked Cart icon
    And Directed to Cart Page
    And User clicked Remove Button for one of the items
    Then Item should be removed from cart