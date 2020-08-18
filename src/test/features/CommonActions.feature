Feature: Common actions

  @Regression @Smoke
  Scenario: TC_01_Verify user is on home page
    Given I am on home page
    And I verify home page logo

  @Smoke
  Scenario: TC_02_Verify login icon on home page
    Given I am on home page
    And I verify login icon is displayed