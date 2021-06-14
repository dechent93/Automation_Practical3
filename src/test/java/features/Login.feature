@Login  
Feature: Validate Techfios Login Functionality 

Background: 
	Given User will be able to login on ibilling website  	
@Scenario 
Scenario: User should be able to login with valid credentials 
	Given User will be able to login on ibilling website  	
	When User enters username "demo@techfios.com"  
	When User enters password "abc123"
	And User clicks on SignIn button 
	Then User should land on the dashboard page