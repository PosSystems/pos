# Use-Case Specification: Select between Management- and Cash- Area
## Table of Contents
tbd    

### 1. Get information

#### 1.1 Brief Description

This use case allows the user, the manager of the PoS System, to choose between two views. 
One view redirects on the use case „Use Management Area“, the other one on the use case „Use Cash Area“. 
Only the manager is allowed to see the use management area.

### 2.Flow of Events

#### 2.1 Basic Flow

Activity Diagram: 

![flow for selling process][flow]

Feature-File:

[Link to the Feature-File][feature]

Mock-Ups:

![Link to Mock-Ups][mockup1]

#### 2.2 Alternative Flows

(n/a)

### 3.Special Requirements

#### 3.1 Performance
See [SRS]


### 4. Preconditions

That the user can come to the „Select betweenManagement-Area/Cash-Area“ view, 
he first must be sight in as a manager. Normal cashiers will never see this view with their log in.
 
### 5. Postconditions

No postconditions.

### 6. Extension Points
(n/a)

### 7. Function Points
We calculated the function points with the following table from TINY TOOLS. The Use Case Register has
22,05 points.
![Function-Point][fp]

<!-- Link definitions -->
[fp]: https://github.com/PosSystems/pos/blob/master/useCase/FP/FPSelectMaCash.PNG
[feature]: https://github.com/PosSystems/pos/blob/master/pos/features/chooseManageAndCash.feature
[flow]: https://github.com/PosSystems/pos/blob/master/useCase/flowChart/useCaseSelectBetweenMandC.PNG
[SRS]: https://github.com/PosSystems/pos/blob/master/SRS.md
[mockup1]:https://github.com/PosSystems/pos/blob/master/useCase/mockUp/UseCaseSelectBetweenMandC.png
