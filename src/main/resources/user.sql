create database user;

create table user(
id int primary key auto_increment,
name varchar(100),
password varchar(100),
createDate datetime,
status int
);