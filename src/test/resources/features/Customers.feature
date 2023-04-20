Feature: Customer scenarios of The-Companion365 Website

  Scenario: User fill the data Customers page
    Given User is on the Easy-Appointments home page
    When User enters username and password
      | positive_test_case_01 |
    And User click the login button
    Then User navigate to customer page
      | cust_test_case_001 |
    Then User navigate to edit page


