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
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private long supplierId;
    private String name;
    private String product;
    private String description;
    private String annotations;
}
