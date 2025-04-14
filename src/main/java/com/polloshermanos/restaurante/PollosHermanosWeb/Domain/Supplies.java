package com.polloshermanos.restaurante.PollosHermanosWeb.Domain;

import jakarta.persistence.Entity;
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
@Entity

public class Supplies {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long suppliesId;
    private String name;
    private float amount;





}
