#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Zealie_TC
Feature: PrimeNG Validation

  @Zealie_TC1
  Scenario: Validate Expected AgentName
    Given Provided with PrimeNG Page Details
    When I Navigate to PrimeNG page
    And Perform Country Filter with "Ends with" Alogn with "A" Serchkeyword
    And Sort Date with ascending
    Then Validate table content with "Stephen Shaw"
