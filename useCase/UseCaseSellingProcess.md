# Use-Case Specification: Perform Selling Process
## Table of Contents
tbd    

### 1. Get information

#### 1.1 Brief Description

This function allows the cashier to do the selling process.
This means he/she can choose product groups and enter the price.
When every article is in the list the cashier can finish the process and change to the "Print" Use Case.

### 2.Flow of Events

#### 2.1 Basic Flow

Activity Diagram: 

![flow for selling process][flow]

Feature-File:

[Link to the Feature-File][feature]

Mock-Ups:

![Link to Mock-Ups][mockup1]
![Mock-Up2][mockup2]
![Mock-Up3][mockup3]
![Mock-Up4][mockup4]

#### 2.2 Alternative Flows

(n/a)

### 3.Special Requirements

#### 3.1 Performance
See [SRS]


### 4. Preconditions

The user only can perform a selling process if he first has logged in as a cashier.
 
### 5. Postconditions

No postconditions.

### 6. Extension Points
(n/a)

### 7. Function Points
We calculated the function points with the following table from TINY TOOLS. The Use Case Register has
92,4 points.
![Function-Point][fp]

<!-- Link definitions -->
[fp]: https://github.com/PosSystems/pos/blob/master/useCase/FP/FPSellingProcess.PNG
[feature]: https://github.com/PosSystems/pos/blob/master/pos/features/sellingProcess.feature
[flow]: https://github.com/PosSystems/pos/blob/master/useCase/flowChart/useCaseSellingProcess.png
[SRS]: https://github.com/PosSystems/pos/blob/master/SRS.md
[mockup1]:https://github.com/PosSystems/pos/blob/master/useCase/screenshots/UseCaseSellingProcess1.png
[mockup2]:https://github.com/PosSystems/pos/blob/master/useCase/screenshots/UseCaseSellingProcess2.png
[mockup3]:https://github.com/PosSystems/pos/blob/master/useCase/screenshots/UseCaseSellingProcess3.png
[mockup4]:https://github.com/PosSystems/pos/blob/master/useCase/screenshots/UseCaseSellingProcess4.png
