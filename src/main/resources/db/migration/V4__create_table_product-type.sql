create table product_type (
    product_type_id bigint primary key auto_increment,
    price decimal(19,2) not null,
    description varchar(255),
    asset boolean
);