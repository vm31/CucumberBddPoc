$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/CommonActions.feature");
formatter.feature({
  "name": "Common actions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_01_Verify user is on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify home page logo",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.i_verify_home_page_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02_Verify login icon on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify login icon is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "HeaderIconsStep.iVerifyLoginIconIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/HomePage.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_01_Verify user is on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify home page logo",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.i_verify_home_page_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02_Verify login icon on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify login icon is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "HeaderIconsStep.iVerifyLoginIconIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});