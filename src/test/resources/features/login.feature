Feature: login
  Scenario: Successfully logged in
    Given I am already on log in page
    When I input username "standard_user"
    And I input password "secret_sauce"
    And I click login button
    Then I redirected to inventory page