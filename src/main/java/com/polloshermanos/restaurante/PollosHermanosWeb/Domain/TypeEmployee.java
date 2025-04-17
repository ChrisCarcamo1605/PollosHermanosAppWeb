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
@Entity
@Table(name = "type_employee")
public class TypeEmployee {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "type_employee_id")
    private long typeEmployedId;
    private String boss;
    private String generalManager;
    private String manager;
    private String cashier;
    private String chef;
    private String cleaningStaff;
    private String maintenanceStaff;
}
