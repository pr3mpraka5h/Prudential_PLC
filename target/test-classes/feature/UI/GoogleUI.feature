#Author: Premprakash
#Date : 11th Jan 2023 
#Description : This Feature file is to hold all GoogleUI related scenario testcases to be handled.
#Last modified : 11th Jan 2023
#ChangeLog :
#     			<Version number> : < Author> : < Date> : <Desc> 

@Regresssion
Feature: GoogleUI validation

    @TC1
    Scenario: Validate Google search response for provided Keyword
    Given Provided with search keyword "Prudential PLC" 
    When Perform search operation for the given keyword on google
    Then Verify the top response as expected and Navigate
    And Verify that the landed page is PrudentialPLC homepage
    Then Close the browser and Quit the Driver

		@TC2
    Scenario: Validate Google search response for provided reversed keyword
    Given Provided with search keyword "PLC Prudential" 
    When Perform search operation for the given keyword on google
    Then Verify the top response as expected and Navigate
    And Verify that the landed page is PrudentialPLC homepage
    Then Close the browser and Quit the Driver
    
    @TC3
    Scenario: Validate Google search response for provided incorrect spelled keyword
    Given Provided with search keyword "Purendtial plc" 
    When Perform search operation for the given keyword on google
    Then Verify the top response as expected and Navigate
    And Verify that the landed page is PrudentialPLC homepage
    Then Close the browser and Quit the Driver
    
    @TC4
    Scenario: Validate Google Auto compelete  
    Given Provided with search keyword "face" 
    When Enter keyword should auto populate all relavant suggestions
    Then Validate all the recommended list contains the provided keyword or not
    And  Choose "facebook" from the recommandation and validate the populated top response 
    Then Close the browser and Quit the Driver