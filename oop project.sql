create database playermanagementsystem;

show databases;

use playermanagementsystem;

create table login(username varchar(20) , password varchar(20));
insert into login values('admin' , '12345');
create table player (name varchar(20) , fname varchar(20), dob varchar(20), fee varchar(20), address varchar(20), phone varchar(20), email varchar(20), education varchar(20), designation varchar(20), nic varchar(20), Id varchar(20))

select * from login

select * from player