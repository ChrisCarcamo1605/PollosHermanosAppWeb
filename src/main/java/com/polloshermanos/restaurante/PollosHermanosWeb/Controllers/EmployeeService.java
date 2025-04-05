package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Employee;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.EmployeeRepository;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Employee getEmployee() {
        return null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
