@calendarpage
Feature: Customer scenarios of The-Companion365 Website

  Scenario: calendar page
    Given User is on the Easy-Appointments home page
    When User enters username and password
      | positive_test_case_01 |
    And User click the login button
    Then User is add event
