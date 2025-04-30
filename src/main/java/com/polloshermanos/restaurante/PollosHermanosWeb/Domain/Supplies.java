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
@Entity (name = "Supplies")
@Table(name = "supplies")

public class Supplies {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "supplies_id")
    private long suppliesId;
    private String name;
    private BigDecimal amount;





}
