@ChangeBackgroundColor @Regression
Feature: Set the background to SkyBlue 
   
Background: 
	Given User will be able to Set SkyBlue Background 
		
@Scenario1
Scenario: User will be able to nagivate in the application URL and set the background color to Sky Blue
	When User clicks on the Set SkyBlue Background button       
	Then Background color will change to Sky Blue 