create table supplier (
    supplier_id bigint primary key auto_increment,
    name varchar(50) not null,
    product varchar(50) not null ,
    description varchar(200) not null,
    annotations varchar(50)
);