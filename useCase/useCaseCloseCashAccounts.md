#Use-Case Specification: Close Check Accounts
##Table of Contents
tbd    

### 1. Get information

#### 1.1 Brief Description

At the end of each day the last user has to close the cash accounts. Therefore he has to count the amount in the cash.
To make it easier the user has only to count every sort of coin and banknote.
After that he will see which amount should be in the cash. He can now count again or close the cash.

### 2.Flow of Events

#### 2.1 Basic Flow

Activity Diagram: 

![flow for selling process][flow]

Feature-File:

![Feature File][feature]

Mock-Ups:

![Mock-Up 1][mockup1]


#### 2.2 Alternative Flows

(n/a)

### 3.Special Requirements

#### 3.1 Performance
See [SRS]


### 4. Preconditions

The user has to click the button to start the action.
 
### 5. Postconditions

n/a

### 6. Extension Points
n/a

<!-- Link definitions -->
[feature]: https://github.com/PosSystems/pos/blob/master/pos/features/closingCashAccount.feature
[flow]: https://github.com/PosSystems/pos/blob/master/useCase/flowChart/useCaseClosingCashAccounts.png
[SRS]: https://github.com/PosSystems/pos/blob/master/SRS.md
[mockup1]:https://github.com/PosSystems/pos/blob/master/useCase/mockUp/UseCaseClosingCashAccounts.png
