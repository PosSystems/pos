Feature: manage product groups
	In order to manage new and existing product groups
	As manager
	I want to create new or edit existing product groups
	
Scenario: edit product group
    Given user has identified as manager
    When manager click on "edit product group"
    And change the existing product group information:
    	| product name   | Tasche |
    	| profit margin  | 10%    |
    	| product number | 10     |
    And manager click "save"
    Then save changes in database
    And redirect to "management area"
    
Scenario: cancel edit product group
    Given user has identified as manager
    When manager click on "edit product group"
    And change the existing product group information:
    	| product name   | Tasche |
    	| profit margin  | 10%    |
    	| product number | 10     |
    And manager click "cancel"
    Then do not save changes in database
    And redirect to "management area"
    
Scenario: new product group
    Given user has identified as manager
    When manager click on "new product group"
    And fill in the following:
    	| product name   | Tasche |
    	| profit margin  | 10%    |
    	| product number | 10     |
    And manager click "save"
    Then save new group in database
    And redirect to "management area"

Scenario: cancel new product group
    Given user has identified as manager
    When manager click on "new product group"
    And fill in the following:
    	| product name   | Tasche |
    	| profit margin  | 10%    |
    	| product number | 10     |
    And manager click "cancel"
    Then do not save new group in database
    And redirect to "management area"