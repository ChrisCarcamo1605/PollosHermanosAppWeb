package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;


import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Employee;

public interface IEmployeeService {

    public Employee getEmployee();

    public Employee saveEmployee(Employee employee);

}
