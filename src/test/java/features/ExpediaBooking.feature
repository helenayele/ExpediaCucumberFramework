Feature: Expedia Various types of Booking

  Scenario Outline: As a user I want to search hotel from Expedia
    Given I am navigated to Expedia
    When I choose Hotel Booking tab
    And I provide Hotel Booking Information
    Then I should be able to view list of Hotel search result
