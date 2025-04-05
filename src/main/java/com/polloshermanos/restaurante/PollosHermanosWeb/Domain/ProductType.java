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

public class ProductType {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long productTypeId;
    private float price;
    private String description;
    private Boolean asset;


}