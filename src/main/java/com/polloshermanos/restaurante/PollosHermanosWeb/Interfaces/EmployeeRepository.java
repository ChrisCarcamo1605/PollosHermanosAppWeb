package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
