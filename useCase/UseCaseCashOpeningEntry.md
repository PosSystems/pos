# Use-Case Specification: Cash Opening Entry
## Table of Contents
tbd    

### 1. Get information

#### 1.1 Brief Description

Each day, during the first start of the cash, the user has to type in the amount of the cash.

### 2.Flow of Events

#### 2.1 Basic Flow

Activity Diagram: 

![flow for selling process][flow]

Feature File:

[Link to the Feature File][feature]

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
The window will only appear during the first start of the cash at a day.
 
### 5. Postconditions

n/a

### 6. Extension Points
n/a

<!-- Link definitions -->
[flow]: https://github.com/PosSystems/pos/blob/master/useCase/flowChart/useCaseCashOpeningEntry.png
[SRS]: https://github.com/PosSystems/pos/blob/master/SRS.md
[feature]: https://github.com/PosSystems/pos/blob/master/pos/features/cashOpeningEntry.feature
[mockup1]: https://github.com/PosSystems/pos/blob/master/useCase/mockUp/UseCaseCashOpeningEntry.png
