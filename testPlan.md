# Master Test Plan - PoS System
## Table of contens
tbd

### Introduction
#### Purpose
The purpose of the Master Test Plan is to gather all of the information necessary to plan and control the test
effort for a given master test plan. It describes the approach to testing the software, and is the top­level plan
generated and used by managers to direct the test effort.
This Test Plan for the Leruka supports the following objectives:  

● Functional testing for main menu  
● Unit test for the implemented functions in unity  
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

● Game logic  
● Controller  
● Models  
● Server  

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
Functional Testing (User Interface Testing)
Table

Unit Test
Table

Testing with end user
Table

### Deliverables
#### Test Evaluation Summaries
Test evaluation is done by hand directly after the test executed.

#### Reporting on Test Coverage
Test coverage is reported on our SonarQube project.

#### Perceived Quality Reports
For showing quality we also use ...

#### Incident Logs and Change Requests
n/a

#### Smoke Test Suite and Supporting Test Scripts
n/a

#### Additional Work Products
n/a

#### Detailed Test Results
tbd

### Testing Workflow
Unit tests are run automatically, we start the functional tests or perform end user tests when we think it is necessary.

### Environmental Needs
#### Base System Hardware
The following table sets forth the system resources for the test effort presented in this Test Plan.
Table

#### Base Software Elements in the Test Environment
The following base software elements are required in the test environment for this Test Plan.
Table

#### Productivity and Support Tools
The following tools will be employed to support the test process for this Test Plan.
Table

#### Test Environment Configurations
The following Test Environment Configurations needs to be provided and supported for this project.
Table

### Responsibilities, Staffing, and Training Needs
#### People and Roles
This table shows the staffing assumptions for the test effort.
Table

### Staffing and Training Needs
This section outlines how to approach staffing and training the test roles for the project.

#### Iteration Milestones
Table

#### Risks, Dependencies, Assumptions, and Constraints
Table

### Appendix
#### Cyclomatic Complexity
Graph

#### Code Style
Diagram

