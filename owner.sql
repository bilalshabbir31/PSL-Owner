create database owner;
use owner;
create table ownerdb(
    Owner_Id varchar(10) not null,
	primary key(Owner_Id),
    [Name] varchar  (25),
	Mail varchar (15),
	Phone_No int,
	Cnic int,
	DOB date,
	Nationality varchar(25)
);


select *from ownerdb;