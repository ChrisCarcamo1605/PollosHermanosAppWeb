package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.TypeEmployee;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveTypeEmployee;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ITypeEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/typeEmployee")
public class TypeEmployeeController {

    @Autowired
    ITypeEmployeeService typeEmployeeService;

    @PostMapping
    public void imprimiMundo(DtoSaveTypeEmployee typeEmployee){
        System.out.println("Hola mundo");
        var newTypeEmployee = new TypeEmployee();
        newTypeEmployee.setBoss(typeEmployee.boos());
        newTypeEmployee.setGeneralManager(typeEmployee.generalManager());
        newTypeEmployee.setManager(typeEmployee.manager());
        newTypeEmployee.setCashier(typeEmployee.cashier());
        newTypeEmployee.setChef(typeEmployee.chef());
        newTypeEmployee.setCleaningStaff(typeEmployee.cleaningStaff());
        newTypeEmployee.setMaintenanceStaff(typeEmployee.maintenanceStaff());

        typeEmployeeService.saveTypeEmployee(newTypeEmployee);
    }
}
