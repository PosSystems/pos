Feature: helloWorld
	In order to test selenium/cucumber
	As someone
	I want to open the helloworld version of our website
	and check if helloworld is shown
	
Scenario: Access Website with Chrome
    Given user has chrome running
    When user navigates to hompepage
    Then message contains Hello world!

Scenario: Access Website with Firefox
    Given user has Firefox running
    When user navigates to hompepage
    Then message contains Hello world!
