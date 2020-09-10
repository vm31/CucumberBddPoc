Feature: validate login functionality
  Scenario:TC_01_validate negative login functionality
    Given I am on home page
    And I click on login icon
    When I enter email id is "EMAIL" and password is "PASSWORD"
    And I click on login button
    #Then i verify the error message


