Drop database if exists pclworld;
create database pclworld;
use pclworld;
drop table if exists country;
create table country(
	Code char(3) not null,
	home char(52) not null, 
	capital int, 
	Primary key(code));
alter table country(
	Name char(52) not null,
	Continent enum("Asia", "Europe", "North America", "Oceania", "Antarctica", "South America") not null,
	Region char(26),
	SurfaceArea decimal(10,2) not null,
	IndeepYear smallint,
	Population int not null,
	LifeExpectancy decimal(3,1),
	GNP decimal(10,2),
	GNPOld decimal(10,2),
	LocalName char(45) not null,
	GovernmentForm char(45) not null,
	HeadofState char(60),
	Capital int not null,
	Code2 char(2)
	);
	
drop table if exists city;
create table city(
	id int not null,
	name char(35) not null,
	countrycode char(3) not null,
	district int not null,
	primary key(id),
	foreign key(countrycode) references country(code));

drop table if exists countrylanguage;
create table countrylanguage(
	countrycode char(3) not null,
	language char(30) not null,
	isOfficial enum("t", "f") not null,
	Percentage decimal (4,1) not null,
	primary key (countrycode, language),
	foreign key (countrycode) references country(code));

	
	