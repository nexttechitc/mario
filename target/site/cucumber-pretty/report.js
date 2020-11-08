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
  "duration": 2345967500,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Signin_Link()"
});
formatter.result({
  "duration": 132315200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Signin_Button()"
});
formatter.result({
  "duration": 833018500,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.enter_UserPass_and_click_login()"
});
formatter.result({
  "duration": 1287672000,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_user_login_successfully()"
});
formatter.result({
  "duration": 1567396400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify search result",
  "description": "",
  "id": "search-functionality;verify-search-result",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "launc \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Type product name",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click search",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify Search result",
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
  "duration": 531338200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.type_product_name()"
});
formatter.result({
  "duration": 55654800,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_search()"
});
formatter.result({
  "duration": 816602500,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_Search_result()"
});
formatter.result({
  "duration": 2731040700,
  "status": "passed"
});
});