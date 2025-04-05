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
public class Supplier {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long supplierId;
    private String name;
    private String product;
    private String description;
    private String annotations;
}
