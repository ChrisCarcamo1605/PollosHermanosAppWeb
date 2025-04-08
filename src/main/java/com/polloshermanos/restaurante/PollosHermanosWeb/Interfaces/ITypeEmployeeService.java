package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.TypeEmployee;

public interface ITypeEmployeeService {

    public TypeEmployee getTypeEmployee();
    public TypeEmployee saveTypeEmployee(TypeEmployee typeEmployee);
}
