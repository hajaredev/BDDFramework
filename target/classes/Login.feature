Feature: Exchange Rate data Validations 

@First
Scenario: 
	Verify exchage rate data is not displyed for plans that are linked to portfolio accounts 
	Given a member login to the XPlan application with "user1" 
	And verify a member has client with assets 
	And verify a member has client with plans linked to portfolio accounts 
	When a member navigates to assets table/section in client focus page 
	Then verify a member navigated to assets table/section 
	And verify exchange rate data is not displayed 
@Second	
Scenario: 
	Exchange rate data must remain intact, for plans that are not linked to portfolio accounts (BAU) 
	Given a member login to the XPlan application with "user2" 
	And verify a member has client with assets 
	And verify a member has client with plans not linked to portfolio accounts 
	When a member navigates to assets table/section in client focus page 
	Then verify a member navigated to assets table/section 
	And verify exchange rate data is displayed  