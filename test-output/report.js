$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/Search.feature");
formatter.feature({
  "name": "Search an item in menu section",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_001_To search an item from women section in menu item",
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
  "name": "I am on home page:\"URL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I print all options in women section\"denim\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStep.iPrintAllOptionsInWomenSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});