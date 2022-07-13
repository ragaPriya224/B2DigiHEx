show databases;

Create database B2Training;

Drop database B2Digi;

use B2Training;
CREATE TABLE student
(
student_ID INT UNSIGNED NOT NULL,
name VARCHAR(20) NOT NULL,
major VARCHAR(50),
grade VARCHAR(5)
);

show tables;

DESCRIBE student; 
DESC student;

ALTER TABLE student
ADD phoneno int;

DROP TABLE student;

CREATE TABLE student
(
student_id INT UNSIGNED NOT NULL,
name VARCHAR(20) NOT NULL,
major VARCHAR(50),
grade VARCHAR(5),
email VARCHAR(20),
CONSTRAINT stu_email_uk   UNIQUE(email),
CONSTRAINT stu_id_pk PRIMARY KEY (student_id)
);

CREATE TABLE employees(
employee_id INT,
last_name VARCHAR(25) NOT NULL,
email VARCHAR(25),salary DOUBLE,
commission_pct DOUBLE,
department_id INT UNSIGNED NOT NULL,
CONSTRAINT emp_id_pk PRIMARY KEY (employee_id),
CONSTRAINT emp_dept_fk FOREIGN KEY (department_id) REFERENCES student(student_id),
CONSTRAINT emp_email_uk UNIQUE(email));

Alter table student add country varchar(25)  DEFAULT 'India';

INSERT INTO student
VALUES (123, "user", "cs", "a","abc@xyz.com","china" );
INSERT INTO student
VALUES (45, "user22", "EE", "c","abc123@xyz.com","china" );
INSERT INTO student
VALUES (67, "user22", "EE", "c","abc56@xyz.com","us" );

INSERT INTO student
VALUES (12347, "user22", "EE", "d","a123bc56@xyz.com","uk" ),
 (4568, "user24", "EC", "a","abc56@xyz.com","india" ),
 (8901, "user26", "CSE", "c","abc1211123@xyz.com","france" );
select * from student;
select * from employees;
delete from student where country = "india" OR country = "uk" OR country = "france";
SET SQL_SAFE_UPDATES = 0;

INSERT INTO student (student_id, name, email)
VALUES (457902,"testUser",'tester@xyz.com' );
truncate table employees;
truncate table student;

delete  from student;

CREATE TABLE movie
(
movie_ID INT UNSIGNED NOT NULL,
name VARCHAR(20) NOT NULL,
genre VARCHAR(50)
);

INSERT INTO MOVIE values(
123456, '3123' , 'aaaa'),
(
456, 'ab' , 'bc'),
(
789, 'de' , 'fg');
select * from movie;
select * from movie
where name = '3idiots';
truncate table movie;
DROP TABLE movie;
INSERT INTO MOVIE values(
123, '3idiots' , 'comedy'),
(
456, 'spiderman' , 'action'),
(
789, 'avengers' , 'comedy ');


INSERT INTO MOVIE values
(11222, 'hulk' , 'action');

select * from movie
where  name = "hulk";

select * from movie;

update movie 
set name = 'captain america'
where  movie_ID = 789;


update movie 
set genre = 'action'
where movie_ID = 789;

delete from movie 
where name = 'hulk';

INSERT INTO MOVIE values
(21, 'hulk' , 'action');
INSERT INTO MOVIE values
(22, 'hulk' , 'comedy');
INSERT INTO MOVIE values
(29, 'captainIndia' , 'action');
select distinct(genre) from movie;

select name as n from movie;

select movie_ID  from movie;
select movie_ID* 10 from movie
where movie_ID <245;

select *  from movie
where  name <> 'hulk';

select *  from movie
where  name =  'hulk' AND   genre =  'comedy' ;
select *  from movie;

select *  from movie
where  name =  'hulk' OR   genre =  'comedy' ;

select * from movie 
WHERE movie_ID BETWEEN 21 AND 123;
select * from movie 
WHERE movie_ID NOT BETWEEN 21 AND 123;

SELECT *
FROM movie
WHERE genre IN ('comedy','horror','action');
SELECT * FROM movie;
SELECT *
FROM movie
WHERE genre NOT IN ('comedy','horror','action');

select *  from movie
where  genre =  'comedy' ;

select * from movie
where name like '%spidy';

select * from movie
where name like 'captain%';

select * from movie
where name like '%spi%';

SELECT * FROM student
WHERE major  IS NULL;

SELECT * FROM student
WHERE major  IS NOT NULL;

select * from movie
order by name desc , genre desc;
select * from movie;
select * from movie
order by name asc;


select column_name, constraint_name , referenced_column_name,referenced_table_name
from information_schema.KEY_COLUMN_USAGE
where TABLE_NAME = 'employees';