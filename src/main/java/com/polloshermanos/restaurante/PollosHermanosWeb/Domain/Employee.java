package com.polloshermanos.restaurante.PollosHermanosWeb.Domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "Employee")
@Table (name = "Employees")
public class Employee {
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long  employeeId;
    private String name;
    private String lastname;

    @Column(name = "tel")
    private String phone;
    private String email;
}
