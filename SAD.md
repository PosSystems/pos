#POS-System
#Software Architecture Document


## 1. Introduction

### 1.1 Purpose
This document provides a comprehensive architectural overview of the system, 
using a number of different architectural views to depict different aspects of the system. 
It is intended to capture and convey the significant architectural decisions which have been made on the system.

### 1.2 Scope
The scope of this SAD is to show the architecture of the PoS application. 
Affected are the class structure, 	the use cases and the data representation.

### 1.3 Definitions, Acronyms, and Abbreviations
| Acronym | |
|---------|---|
| tbd | to be determined |
| n/a | not avaiable |

### 1.4 References
[MVC Model][MVC]  
[Classdiagram][classdiagram]  
[DB Model][db]

### 1.5 Overview
This document describes the software architecture to ensure that everybody understands it 
and new developers can be let into the project easily. It describes how the application is structured, 
why it is structured like it is and what we do to ensure that our code meets a certain quality standard.

## 2. Architectural Representation 
This project will use the MVC architecture.
![MVC][MVC_pic]

## 3. Architectural Goals and Constraints 
The main goal of the MVC architecture is to separate the view from the logic. 
Therefore the view knows 	nothing on its own, but gets all information from the logical part. 
To realize this structure, we’re using 	Spring.

## 4. Use-Case View
n/a
### 4.1 Use-Case Realizations

## 5. Logical View 
### 5.1 Overview
Classdiagram:
![UML][classdiagram_pic]

## 6. Process View 
n/a

## 7. Deployment View
![software architecture][sa]

## 8. Implementation View 

### 8.1 Overview
n/a
### 8.2 Layers
n/a

## 9. Data View 
DB-Model:  
![DB-Model][db_pic]

## 10. Size and Performance 
n/a

## 11. Quality 
n/a


<!-- Link definitions: -->
[MVC]: https://developer.apple.com/library/content/documentation/General/Conceptual/DevPedia-CocoaCore/MVC.html
[classdiagram]: https://github.com/PosSystems/pos/blob/master/Classdiagram_MVC.pdf
[classdiagram_pic]: https://github.com/PosSystems/pos/blob/master/graphics/classdiagram_MVC.PNG
[db]: https://github.com/PosSystems/pos/blob/master/DBSchema.pdf
[db_pic]: https://github.com/PosSystems/pos/blob/master/graphics/DB_Shema.PNG
[MVC_pic]: https://github.com/PosSystems/pos/blob/master/graphics/mvc.png
[sa]: https://github.com/PosSystems/pos/blob/master/graphics/DeploymentDiagram.png
