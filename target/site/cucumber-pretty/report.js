$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Login",
  "description": "",
  "id": "search-functionality;verify-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "launc \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on Signin Link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Signin Button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter UserPass and click login",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify user login successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 7
    }
  ],
  "location": "homePageStepDep.launc(String)"
});
formatter.result({
  "duration": 5922623700,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Signin_Link()"
});
formatter.result({
  "duration": 667672300,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Signin_Button()"
});
formatter.result({
  "duration": 1014769200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.enter_UserPass_and_click_login()"
});
formatter.result({
  "duration": 7608529600,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_user_login_successfully()"
});
formatter.result({
  "duration": 4755020200,
  "status": "passed"
});
});