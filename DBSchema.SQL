IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblProductGroup]') AND type in (N'U'))
    DROP TABLE [dbo].[tblProductGroup]
GO
CREATE TABLE [dbo].[tblProductGroup] (
[intId] int  NOT NULL  
, [stName] char(30)  NOT NULL  
, [fltProfitMargin] float  NOT NULL  
, [intVatId] int  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblProductGroup] ADD CONSTRAINT [tblProductGroup_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblOpeningBalance]') AND type in (N'U'))
    DROP TABLE [dbo].[tblOpeningBalance]
GO
CREATE TABLE [dbo].[tblOpeningBalance] (
[intId] int identity  NOT NULL  
, [datDate] date  NOT NULL  
, [intEmployeeId] int  NOT NULL  
, [fltAmount] float  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblOpeningBalance] ADD CONSTRAINT [tblOpeningBalance_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblEmployee]') AND type in (N'U'))
    DROP TABLE [dbo].[tblEmployee]
GO
CREATE TABLE [dbo].[tblEmployee] (
[intId] int  NOT NULL  
, [intTitleId] int  NULL  
, [strGivenName] char(30)  NULL  
, [strSurname] char(30)  NOT NULL  
, [strStreet] char(50)  NULL  
, [intPostcode] int  NULL  
, [strCity] char(30)  NULL  
, [strPassword] char(20)  NULL  
, [bitManagementArea] bit  NULL  
)
GO

ALTER TABLE [dbo].[tblEmployee] ADD CONSTRAINT [tblEmployee_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblCashBalance]') AND type in (N'U'))
    DROP TABLE [dbo].[tblCashBalance]
GO
CREATE TABLE [dbo].[tblCashBalance] (
[intId] int identity  NOT NULL  
, [datDate] date  NOT NULL  
, [intEmployeeId] int  NOT NULL  
, [fltAmount] float  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblCashBalance] ADD CONSTRAINT [tblCashBalance_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblTitle]') AND type in (N'U'))
    DROP TABLE [dbo].[tblTitle]
GO
CREATE TABLE [dbo].[tblTitle] (
[intId] int identity  NOT NULL  
, [strTitle] char(10)  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblTitle] ADD CONSTRAINT [tblTitle_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblVat]') AND type in (N'U'))
    DROP TABLE [dbo].[tblVat]
GO
CREATE TABLE [dbo].[tblVat] (
[intId] int identity  NOT NULL  
, [fltVt] float  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblVat] ADD CONSTRAINT [tblVat_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblReceiptHead]') AND type in (N'U'))
    DROP TABLE [dbo].[tblReceiptHead]
GO
CREATE TABLE [dbo].[tblReceiptHead] (
[intId] int identity  NOT NULL  
, [intReceiptNumber] int  NOT NULL  
, [datTimestamp] timestamp  NOT NULL  
, [intEmployeeId] int  NOT NULL  
, [fltTotal] float  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblReceiptHead] ADD CONSTRAINT [tblReceiptHead_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblReceiptDetails]') AND type in (N'U'))
    DROP TABLE [dbo].[tblReceiptDetails]
GO
CREATE TABLE [dbo].[tblReceiptDetails] (
[intId] int identity  NOT NULL  
, [intReceiptHeadId] int  NOT NULL  
, [intProductGroupId] int  NOT NULL  
, [strName] char(30)  NOT NULL  
, [fltProfitMargin] float  NOT NULL  
, [fltVat] float  NOT NULL  
, [fltSellingPrice] float  NOT NULL  
)
GO

ALTER TABLE [dbo].[tblReceiptDetails] ADD CONSTRAINT [tblReceiptDetails_PK] PRIMARY KEY CLUSTERED (
[intId]
)
GO
GO

ALTER TABLE [dbo].[tblProductGroup] WITH CHECK ADD CONSTRAINT [tblVat_tblProductGroup_FK1] FOREIGN KEY (
[intVatId]
)
REFERENCES [dbo].[tblVat] (
[intId]
)
ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[tblOpeningBalance] WITH CHECK ADD CONSTRAINT [tblEmployee_tblOpeningBalance_FK1] FOREIGN KEY (
[intEmployeeId]
)
REFERENCES [dbo].[tblEmployee] (
[intId]
)
GO

ALTER TABLE [dbo].[tblEmployee] WITH CHECK ADD CONSTRAINT [tblTitle_tblEmployee_FK1] FOREIGN KEY (
[intTitleId]
)
REFERENCES [dbo].[tblTitle] (
[intId]
)
ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[tblCashBalance] WITH CHECK ADD CONSTRAINT [tblEmployee_tblCashBalance_FK1] FOREIGN KEY (
[intEmployeeId]
)
REFERENCES [dbo].[tblEmployee] (
[intId]
)
GO

GO

GO

ALTER TABLE [dbo].[tblReceiptHead] WITH CHECK ADD CONSTRAINT [tblEmployee_tblReceiptHead_FK1] FOREIGN KEY (
[intEmployeeId]
)
REFERENCES [dbo].[tblEmployee] (
[intId]
)
GO

ALTER TABLE [dbo].[tblReceiptDetails] WITH CHECK ADD CONSTRAINT [tblReceiptHead_tblReceiptDetails_FK1] FOREIGN KEY (
[intReceiptHeadId]
)
REFERENCES [dbo].[tblReceiptHead] (
[intId]
)
ON UPDATE CASCADE
ON DELETE CASCADE
GO

