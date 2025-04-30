create table ingredientes(

    ingredientes_id bigint primary key auto_increment,
    name varchar(50) not null,
    description varchar(50),
    unit_of_measurement varchar(50) not null ,
    unit_price decimal(10,2) not null,
    asset boolean
)