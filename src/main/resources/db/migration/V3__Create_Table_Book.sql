drop table if exists books cascade;


create table books (id int8 not null, title varchar(255), author varchar(255), imageURL varchar(255), description varchar(255), price int not null, rating int, primary key (id));