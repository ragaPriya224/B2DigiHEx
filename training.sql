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