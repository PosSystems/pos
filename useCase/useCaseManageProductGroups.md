# Use-Case Specification: Manage Product Groups
## Table of Contents
tbd    

### 1. Get information

#### 1.1 Brief Description

This use case allows the user, the manager of the PoS System, to edit and create new product groups. 
This means he has the possibility to create new product groups with their name, their number (ID) and their profit margin. 
He also can change already existing product groups.

[CRUD][crud]

### 2.Flow of Events

#### 2.1 Basic Flow

Activity Diagram: 

![flow for selling process][flow]

Feature File:

[Link to Feature-File][feature]

Mock-Up:

![Link to Mock-Ups][mockup1]

#### 2.2 Alternative Flows

(n/a)

### 3.Special Requirements

#### 3.1 Performance
See [SRS]

#### 3.2 Other devices
As this POS application is targeted towards small retail business we expect it to run on screen sized of desktop computers. 
As this is a web application and as such can potentially be used in mobile devices too, we should keep in mind to make singular UI components not too large to make it easier to adapt to smaller screens should the need arise.
This explicitly is not a must and must in no way stand in the way of other important design decisions.

### 4. Preconditions
The user only can change or create new product groups if he first has logged in as a manager and then chose the management view.
 
### 5. Postconditions

n/a

### 6. Extension Points
n/a

<!-- Link definitions -->
[flow]: https://github.com/PosSystems/pos/blob/master/useCase/flowChart/useCaseManageProductGroups.PNG
[SRS]: https://github.com/PosSystems/pos/blob/master/SRS.md
[mockup1]: https://github.com/PosSystems/pos/blob/master/useCase/mockUp/UseCaseManageProductGroups.png
[feature]: https://github.com/PosSystems/pos/blob/master/pos/features/manageProductGroups.feature
[crud]: https://github.com/PosSystems/pos/blob/master/graphics/CRUD_no_delete.PNG
