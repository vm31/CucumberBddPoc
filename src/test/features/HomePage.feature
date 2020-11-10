Feature: Home page

  #@regression @smoke
  #Scenario: TC_01_Verify user is on home page
    #Given I am on home page
    #And I verify home page logo

  @regression
  Scenario: TC_02_Select item from menu item
    Given I am on home page:"URL"
    And I verify login icon is displayed
    When I select menu item "Women"
    Then I verify current url:"https://www.justyouroutfit.com/"
    
