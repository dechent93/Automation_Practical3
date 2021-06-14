@CreateNewAccount @Regression
Feature: Create a new account on Bank and Cash Page 
   
Background: 
	Given User will be able to login on ibilling website
		
@Scenario1
Scenario Outline: User will be able to login in with valid credentials and add a new customer in Bank & Cash
	When User enters "<username>" and "<password>"       
	And User clicks on SignIn button
	Then User should land on the dashboard page   
	When User clicks on Bank and Cash 
	When User clicks on New Account  
	When User fills the form entering "<AccountTile>" and "<Description>" and "<InitialBalance>" and "<AccountNumber>" and "<ContactPerson>" and "<Phone>" 
	Then User should clicks on submit button 
	Then User is able to verify the Account was created successfully
	
	Examples: 
	|username			| password |AccountTile    |	Description |  InitialBalance |  AccountNumber | ContactPerson 		| Phone |
	|demo@techfios.com	| abc123   |TsheringSavings|	Savings		|	900			  |		891829832  |	 Tshering		| 878200973|
	
	
