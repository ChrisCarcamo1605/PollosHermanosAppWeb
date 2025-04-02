package com.polloshermanos.restaurante.PollosHermanosWeb.Domain;

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
