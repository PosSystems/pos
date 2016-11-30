CREATE TABLE tblTitle (
intId int  NOT NULL  AUTO_INCREMENT
, strTitle char(10)  NOT NULL  
, PRIMARY KEY (intId)
);

CREATE TABLE tblVat (
intId int  NOT NULL  AUTO_INCREMENT
, fltVt float  NOT NULL  
, PRIMARY KEY (intId)
);

CREATE TABLE tblProductGroup (
intId int  NOT NULL  
, stName char(30)  NOT NULL  
, fltProfitMargin float  NOT NULL  
, intVatId int  NOT NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intVatId
)
REFERENCES tblVat (
intId
)
);

CREATE TABLE tblEmployee (
intId int  NOT NULL  
, intTitleId int  NULL  
, strGivenName char(30)  NULL  
, strSurname char(30)  NOT NULL  
, strStreet char(50)  NULL  
, intPostcode int  NULL  
, strCity char(30)  NULL  
, strPassword char(20)  NULL  
, bitManagementArea bit  NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intTitleId
)
REFERENCES tblTitle (
intId
)
);

CREATE TABLE tblOpeningBalance (
intId int  NOT NULL AUTO_INCREMENT 
, datDate date  NOT NULL  
, intEmployeeId int  NOT NULL  
, fltAmount float  NOT NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intEmployeeId
)
REFERENCES tblEmployee (
intId
)
);

CREATE TABLE tblCashBalance (
intId int  NOT NULL AUTO_INCREMENT 
, datDate date  NOT NULL  
, intEmployeeId int  NOT NULL  
, fltAmount float  NOT NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intEmployeeId
)
REFERENCES tblEmployee (
intId
)
);

CREATE TABLE tblReceiptHead (
intId int  NOT NULL  AUTO_INCREMENT
, intReceiptNumber int  NOT NULL  
, datTimestamp timestamp  NOT NULL  
, intEmployeeId int  NOT NULL  
, fltTotal float  NOT NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intEmployeeId
)
REFERENCES tblEmployee (
intId
)
);

CREATE TABLE tblReceiptDetails (
intId int  NOT NULL  AUTO_INCREMENT
, intReceiptHeadId int  NOT NULL  
, intProductGroupId int  NOT NULL  
, strName char(30)  NOT NULL  
, fltProfitMargin float  NOT NULL  
, fltVat float  NOT NULL  
, fltSellingPrice float  NOT NULL  
, PRIMARY KEY (intId)
,FOREIGN KEY (
intReceiptHeadId
)
REFERENCES tblReceiptHead (
intId
)
);

