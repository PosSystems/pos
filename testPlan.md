# Master Test Plan - PoS System
## Table of contens
tbd

### Introduction
#### Purpose
The purpose of the Test Plan is to gather all of the information necessary to plan and control the test
effort for a given master test plan. It describes the approach to testing the software, and is the top level plan
generated and used by managers to direct the test effort.
This Test Plan for PoS supports the following objectives:  

● Functional testing for main menu  
● Unit test for the implemented functions in our business classes
● Testing with end user

#### Scope
Functional Testing
Will blackbox test the application behaviour by using cucumber.
Unit tests
Will test the internal application logic.
Testing with end user
Will test the user interface if it is easy to learn.


#### Intended Audience  
● Students  
● Professors  
● Programmer  

#### Document Terminology and Acronyms
n/a

#### References
n/a

### Evaluation Mission and Test Motivation
Automated Testing is good for detect coding errors and will show them. Programmer are lazy people and test
only things they have changed. To prevent error in the productive run, we have to detect error in the
development process.

#### Background
Because our team includes some programmers, it could happen that while changing, deleting or updating code
the already existing code is negativly affected. The automatic testing should discover these.

#### Evaluation Mission
Testing is done to provide a stable software. And we will fulfill the goal by the following points.  

● find as many bugs as possible  
● find important problems  
● certify a standard  
● verify software specification

#### Test Motivatorss  
● technical risks  
● functional requirements  
● non functional requirements  

### Target Test Items
The listing below identifies those test items⎯software, hardware, and supporting product elements ⎯that have
been identified as targets for testing. This list represents what items will be tested.  

● Business logic  
● Models  

### Outline of Planned Tests
#### Outline of Test Inclusions  
● Functional Tests  
● Unit Tests  
● Testing with end users

#### Outline of Other Candidates for Potential Inclusion
n/a

#### Outline of Test Exclusions
n/a

### Test Approach  
● Functional Tests  
● Unit Tests, automatically after gradle build  
● Testing with end user

#### Initial Test Idea Catalogs and Other Reference Sources
#### Testing Techniques and Types
##### Data and Database Integrity Testing
n/a

#### Function Testing
| | |
|-|-|
| **Technique Objective:** | Exercise target-of-test functionality, including data entry and processing. |
| **Technique:** | Execute each use-case scenario�s individual use-case flows or functions and features, using valid and invalid data, to verify that:  <br>- the expected results occur when valid data is used <br> - the appropriate error or warning messages are displayed when 	invalid data is used <br> - each business rule is properly applied |
| **Oracles:** | We assume  all tests to pass. |
| **Required Tools:** | JUnit 4 |
| **Success Criteria:** | JUnit test class for each business class |
| **Special Considerations:** | n/a |


#### Business Cycle Testing
n/a

#### User Interface Testing
| | |
|-|-|
| **Technique Objective:** | Exercise target-of-test functionality, including navigation, data entry and processing using the means of the UI. |
| **Technique:** | Execute each use-case scenario�s individual use-case flows or functions and features, using valid and invalid data, to verify that:  <br>- the expected results occur when valid data is used <br> - the appropriate error or warning messages are displayed when 	invalid data is used <br> - each business rule is properly applied |
| **Oracles:** | We assume  all tests to pass. |
| **Required Tools:** | - Selenium Driver <br> - Cucumber extension for Eclipse |
| **Success Criteria:** | A cucumber file for each Use-Case that test every possible path. |
| **Special Considerations:** | n/a |

#### Performance Profiling
n/a

#### Load Testing
n/a

#### Stress Testing
n/a

#### Volume Testing
n/a

#### Security and Access Control Testing
n/a

#### Failover and Recovery Testing
n/a

#### Configuration Testing
n/a

#### Installation Testing
n/a


## Entry and Exit Criteria

### Test Plan

#### Test Plan Entry Criteria
n/a

#### Test Plan Exit Criteria
n/a

#### Suspension and resumption criteria
n/a

### Deliverables
#### Test Evaluation Summaries
Test evaluation is done by hand directly after the test executed.

#### Reporting on Test Coverage
Test coverage is reported on our SonarQube project.

#### Perceived Quality Reports
n/a

#### Incident Logs and Change Requests
n/a

#### Smoke Test Suite and Supporting Test Scripts
n/a

#### Additional Work Products
n/a

#### Detailed Test Results
n/a

### Testing Workflow
Unit tests are run automatically, we start the functional tests or perform end user tests when we think it is necessary.

### Environmental Needs
#### Base System Hardware
Computer with working internet connection.

#### Base Software Elements in the Test Environment
The following base software elements are required in the test environment for this Test Plan.
| Software Element Name | Version | Type and Other Notes |
| - | - | - |
| Silenium Webdriver | current | Chrome Driver |
| Maven | current | For Downloading missing Test Dependencies |

#### Productivity and Support Tools
The following tools will be employed to support the test process for this Test Plan.
| Tool Category or Type | Tool Brand Name | Vendor or In-house | Version |
|-----------------------|-----------------|--------------------|---------|
| Project Management | JIRA | Atlassasin | |
| DBMS tools | **???phpmyadmin???** | | |
| etc | | |

#### Test Environment Configurations
n/a

### Responsibilities, Staffing, and Training Needs
#### People and Roles
We already announced this in our blog post ["RUP roles and technology"](https://possystemsweb.wordpress.com/2016/10/15/technologies-and-team-roles/).

### Staffing and Training Needs
n/a

#### Iteration Milestones
| Milestone | Planned Start Date | Actual Start Date | Planned End Date | Actual End Date |
|-----------|--------------------|-------------------|------------------|-----------------|
| Iteration starts | 25.04.2017 | | | |
| > 20% Test Coverage | 25.04.2017 | 25.04.2017 | 21.06.2017 | 03.05.2017 |
| Have Functional Tests | 25.04.2017 | 25.04.2017 | 21.06.2017 | **tbd** |
| Have Unit Tests | 25.04.2017 | 25.04.2017 | 21.06.2017 | **tbd** |
| Have **tbd/WHATEVER** Tests | 25.04.2017 | 25.04.2017 | 21.06.2017 | **tbd** |
| Tests integrated in CI | 25.04.2017 | 25.04.2017 | 21.06.2017 | **tbd** |
| Iteration ends | | | 21.06.2017 | |


#### Risks, Dependencies, Assumptions, and Constraints
| Risk | Mitigation Strategy | Contingency (Risk is realized) |
|------|---------------------|--------------------------------|
| Test data proves to be inadequate. | Tester will indicate what is required and will ensure to use a full set of suitable and protected test data. | Redefine test data |
| Database is corrupt | Database-Admin will endeavor to keep data clean and make regularly full database backups. | Restore database |

### Appendix
#### Cyclomatic Complexity
n/a

#### Code Style
n/a

