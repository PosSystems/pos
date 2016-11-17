Feature: choose between management- & cash- area
	In order to choose between management- & cash- area
	As manager
	I want to react on managers decision if he/ she wants to see management or cash area

Scenario: show management area
	Given user has identified as manager 
	When manager click on "management area" 
	Then show "management area"
	
Scenario: show cash area
	Given user has identified as manager  
	When manager click on "cash area"
	Then show "cash area"