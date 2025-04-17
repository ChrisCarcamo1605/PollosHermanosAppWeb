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
@Table(name = "ticket_detail")
public class TicketDetail {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_detail_id")
    private long ticketDetailId;
    private BigDecimal subTotal;
}
