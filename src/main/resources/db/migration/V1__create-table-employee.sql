create table employees(
    employee_id bigint primary key auto_increment,
    name varchar(50) not null,
    lastname varchar(50) not null,
    tel varchar(8) not null,
    email varchar(50) not null
);