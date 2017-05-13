Feature: selling process
    This function allows the cashier to do the selling process. This means he/she can choose product groups and enter the price. When every article is in the list the cashier can finish the process and change to the "Print" Use Case
Scenario: enter price for product group
	Given cashier is on the cash area site
	When cashier clicks on a product group button
	And cashier enters 10.0 in the opened dialog 
	Then the article is shown in the list with the price of 10.0
	
Scenario: Payment
    Given cashier has entered price for product group
    When cashier clicks on payment button
    And cashier enters payment given in the payment dialog
    Then a dialog containing the difference in payment appears
    And the article is removed from the list