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
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    private String name;
    private Boolean asset;
    private String description;
}
