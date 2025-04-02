package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;


import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.DtoSaveEmployee;
import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Employee;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")

public class EmployeeController {


    @Autowired
    IEmployeeService employeeService;


    @PostMapping
    public void imprimiMundo(DtoSaveEmployee employee){
        System.out.println("Hola Mundo");

        var newEmployee = new Employee();
        newEmployee.setName(employee.name());
        newEmployee.setLastname(employee.lastname());
        newEmployee.setEmail(employee.email());
        newEmployee.setPhone(employee.phone());

        employeeService.saveEmployee(newEmployee);
    }

}
