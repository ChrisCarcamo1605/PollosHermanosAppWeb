create table type_employee(
  type_employee_id bigint primary key auto_increment,
  boss varchar(50),
  generalManager varchar(50),
  manager varchar(50),
  cashier varchar(50),
  chef varchar(50),
  cleaningStaff varchar(50),
  maintenanceStaff varchar(50)
);