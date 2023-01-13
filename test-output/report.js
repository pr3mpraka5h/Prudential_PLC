$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UI/GoogleUI.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Premprakash"
    },
    {
      "line": 2,
      "value": "#Date : 11th Jan 2023"
    },
    {
      "line": 3,
      "value": "#Description : This Feature file is to hold all GoogleUI related scenario testcases to be handled."
    },
    {
      "line": 4,
      "value": "#Last modified : 11th Jan 2023"
    },
    {
      "line": 5,
      "value": "#ChangeLog :"
    },
    {
      "line": 6,
      "value": "#     \t\t\t\u003cVersion number\u003e : \u003c Author\u003e : \u003c Date\u003e : \u003cDesc\u003e"
    }
  ],
  "line": 9,
  "name": "GoogleUI validation",
  "description": "",
  "id": "googleui-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 8,
      "name": "@Regresssion"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Validate Google search response for provided Keyword",
  "description": "",
  "id": "googleui-validation;validate-google-search-response-for-provided-keyword",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Provided with search keyword \"Prudential PLC\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Perform search operation for the given keyword on google",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Verify the top response as expected and Navigate",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify that the landed page is PrudentialPLC homepage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Close the browser and Quit the Driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Prudential PLC",
      "offset": 30
    }
  ],
  "location": "GoogleUI.provided_with_search_keyword(String)"
});
formatter.result({
  "duration": 4046041200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.perform_search_operation_for_the_given_keyword_on_google()"
});
formatter.result({
  "duration": 2830067500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_the_top_response_as_expected_and_navigate()"
});
formatter.result({
  "duration": 4392726600,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_that_the_landed_page_is_prudential_plc_homepage()"
});
formatter.result({
  "duration": 6821000,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.close_the_browser_and_quit_the_driver()"
});
formatter.result({
  "duration": 651561300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validate Google search response for provided reversed keyword",
  "description": "",
  "id": "googleui-validation;validate-google-search-response-for-provided-reversed-keyword",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Provided with search keyword \"PLC Prudential\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Perform search operation for the given keyword on google",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Verify the top response as expected and Navigate",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify that the landed page is PrudentialPLC homepage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Close the browser and Quit the Driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "PLC Prudential",
      "offset": 30
    }
  ],
  "location": "GoogleUI.provided_with_search_keyword(String)"
});
formatter.result({
  "duration": 2314599500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.perform_search_operation_for_the_given_keyword_on_google()"
});
formatter.result({
  "duration": 1430830100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_the_top_response_as_expected_and_navigate()"
});
formatter.result({
  "duration": 3452685300,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_that_the_landed_page_is_prudential_plc_homepage()"
});
formatter.result({
  "duration": 11647900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.close_the_browser_and_quit_the_driver()"
});
formatter.result({
  "duration": 628580100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate Google search response for provided incorrect spelled keyword",
  "description": "",
  "id": "googleui-validation;validate-google-search-response-for-provided-incorrect-spelled-keyword",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TC3"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Provided with search keyword \"Purendtial plc\"",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Perform search operation for the given keyword on google",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Verify the top response as expected and Navigate",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Verify that the landed page is PrudentialPLC homepage",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Close the browser and Quit the Driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Purendtial plc",
      "offset": 30
    }
  ],
  "location": "GoogleUI.provided_with_search_keyword(String)"
});
formatter.result({
  "duration": 5047849200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.perform_search_operation_for_the_given_keyword_on_google()"
});
formatter.result({
  "duration": 2411668900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_the_top_response_as_expected_and_navigate()"
});
formatter.result({
  "duration": 3808188400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.verify_that_the_landed_page_is_prudential_plc_homepage()"
});
formatter.result({
  "duration": 9127900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.close_the_browser_and_quit_the_driver()"
});
formatter.result({
  "duration": 634584400,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validate Google Auto compelete",
  "description": "",
  "id": "googleui-validation;validate-google-auto-compelete",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@TC4"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Provided with search keyword \"face\"",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "Enter keyword should auto populate all relavant suggestions",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Validate all the recommended list contains the provided keyword or not",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Choose \"facebook\" from the recommandation and validate the populated top response",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Close the browser and Quit the Driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "face",
      "offset": 30
    }
  ],
  "location": "GoogleUI.provided_with_search_keyword(String)"
});
formatter.result({
  "duration": 3843771200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.enter_keyword_should_auto_populate_all_relavant_suggestions()"
});
formatter.result({
  "duration": 1062393800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.validate_all_the_recommended_list_contains_the_provided_keyword_or_not()"
});
formatter.result({
  "duration": 146606500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "facebook",
      "offset": 8
    }
  ],
  "location": "GoogleUI.choose_from_the_recommandation_and_validate_the_populated_top_response(String)"
});
formatter.result({
  "duration": 15962600,
  "status": "passed"
});
formatter.match({
  "location": "GoogleUI.close_the_browser_and_quit_the_driver()"
});
formatter.result({
  "duration": 632728100,
  "status": "passed"
});
});