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
@tag
Feature: Title of your feature I want to use this template for my feature file

#Background: List of steps run before each of the scenarios

#Background:
#Given validate the browser
#When browser is trigged
#Then check if browser is started

  @tag1
  Scenario: Basic scenario
   	Given I want to write a step with precondition
    And some other precondition
    When I complete action with "string"
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

	#if we need to parameteriazing  the values we need to use scenario outline
	#we can use multiple tgss for 1 scenrios also
	
#	@tag1
  @tag2 
  Scenario Outline: scenario with values
    Given I want to write a step with name <name> 
    #write the key in <> to pass the value
    When I check for the <value> in step
    Then I verify the <status> in step
    
    Examples:  #it is keyword to pass the parameterized vaues
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
 	@tag3
  Scenario: data driven scenario
    Given user is on signup page
    When user signup with following details
    |First name | Last name | email@yopmail.com | Address | 50324 |
