CREATE DATABASE jdbc_db;

use jdbc_db;

create table employee(
    id INT(15) PRIMARY KEY Auto_Increment,
    name VARCHAR(30),
    gender BOOLEAN,
    birth_date DATE,
    salary REAL
);