#Author: Premprakash
#Date : 13th Jan 2023 
#Description : This Feature file is to hold all GoogleUI related scenario testcases to be handled.
#Last modified : 11th Jan 2023
#ChangeLog :
#     			<Version number> : < Author> : < Date> : <Desc> 

@RegresssionAPI
Feature: GmailAPI validation

    @TC1
    Scenario: Validate Mypersonal Gmail having expected number of Label category
    Given Provided with accesstoken to access mypersonal gmail 
    When I perform search the list of labels available in my gmail
    Then validate the actual count is matching against "30"
    And Verify the list contains "Unicef" keyword in it 

    
    @TC2
    Scenario: verify number of unread message on "Unicef" label in my personal gmail
    Given Provided with accesstoken to access mypersonal gmail 
    When I perform search the list of labels available in my gmail
    Then Find the respective labelID for "Unicef" label
    And Verify all the mail inside unicef is read
    
    
    @TC3
    Scenario: Validate the recent mail subject from a specific person
    Given Provided with accesstoken to access mypersonal gmail
    When I search for the latest mail from "Test Mail for Prudential" in inbox
    Then Using its ID validate its subject contains "Testing Mail"  