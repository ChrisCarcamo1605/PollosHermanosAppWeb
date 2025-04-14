CREATE TABLE tickets(
    ticket_id bigint primary key auto_increment,
    date DATETIME not null,
    total_amount decimal(10,2) not null ,
    active bool default 1
)