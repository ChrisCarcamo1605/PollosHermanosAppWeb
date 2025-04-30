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
@Entity(name = "Ingredients")
@Table(name = "ingredientes")
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredientes_id")
    private long ingredientsId;
    private String name;
    private String description;
    private String unitOfMeasurement;
    private BigDecimal unitPrice;
    private Boolean asset;
}
