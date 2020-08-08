$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/G.Hemanth Kumar/eclipse-workspace/CumcuberOrange/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Orange Logi n Feature",
  "description": "",
  "id": "orange-logi-n-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Orange Login Test Feature",
  "description": "",
  "id": "orange-logi-n-feature;orange-login-test-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I was already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I was enter \"Admin\" and \"admin123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I was clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I was in home page and check the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I was click Admin",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I was close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.I_was_already_in_login_page()"
});
formatter.result({
  "duration": 9863252200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.I_was_username_and_password(String,String)"
});
formatter.result({
  "duration": 204709100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.I_was_clicks_on_login_button()"
});
formatter.result({
  "duration": 5771962400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.I_was_in_home_page_and_check_the_page_title()"
});
formatter.result({
  "duration": 10197200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.I_was_click_Admin()"
});
formatter.result({
  "duration": 81260400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.I_was_close_browser()"
});
formatter.result({
  "duration": 91017400,
  "status": "passed"
});
});