Feature: Cash Check
	As cashier
	I want to count if the amount saved in the POS system is the same as in tha cash box itself

Scenario: check Cash in system
	Given cashier is on the cash area site 
	When cashier clicks the Cash Check button
	And cashier enters a value of 10 in the counted textfield
	And cashier clicks th OK button
	Then show the difference of cash counted and cash in the box
	
Scenario: hit the abort button
	Given cashier is on the cash area site
	When cashier clicks the Cash Check button
	And cashier clicks the abort button
	Then show Cash Area
