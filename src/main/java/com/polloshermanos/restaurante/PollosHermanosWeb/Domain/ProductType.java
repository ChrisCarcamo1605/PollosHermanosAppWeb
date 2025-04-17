package com.polloshermanos.restaurante.PollosHermanosWeb.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column (name = "product_type_id")
    private long productTypeId;
    private BigDecimal price;
    private String description;
    private Boolean asset;


}