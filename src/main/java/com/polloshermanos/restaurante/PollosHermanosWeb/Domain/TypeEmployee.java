package com.polloshermanos.restaurante.PollosHermanosWeb.Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeEmployee {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long typeEmployedId;
    private String boss;
    private String generalManager;
    private String manager;
    private String cashier;
    private String chef;
    private String cleaningStaff;
    private String maintenanceStaff;
}
