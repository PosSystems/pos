Feature: closing cash accounts 
	In order to close the cash accounts at the end of the day
	As cashier
	I want to count if the amount in the cash box is the same as the POS system counted the whole day

Scenario: click closing accounts 
	When cashier clicks on "Closing Accounts" 
	Then show dialog "Counting" 
	
Scenario: result is fine 
	Given cashier has counted the amount of cash box 
	When cashier filled the dialog with counted amount 
	And clicked "Result is okay - Yes" 
	Then close "Closing Accounts" 
	
Scenario: result is not fine 
	Given cashier has counted the amount of cash box 
	When cashier filled the dialog with counted amount 
	And clicked "Result is okay - No" 
	Then return to typing in amount again
