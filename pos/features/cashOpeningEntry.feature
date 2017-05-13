Feature: cash opening entry
	In order to do the cash opening at the beginning of the day
	As cashier
	I want to count if the amount saved in the POS system is the same as in tha cash box itself

Scenario: show dialog "Counting"
	Given user has identified as cashier 
	When cashier opens the cash area the first time a day
	Then show dialog "Counting"
	
Scenario: finish opening cash
	Given cashier has counted the amount of cash box 
	When cashier filled the dialog with counted amount
	And clicked "Okay"
	Then close opening entry
	And show "Cash Area"
