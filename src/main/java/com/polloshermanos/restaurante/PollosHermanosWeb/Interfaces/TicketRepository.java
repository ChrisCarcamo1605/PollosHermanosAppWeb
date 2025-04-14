package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TicketRepository extends JpaRepository <Ticket,Long> {
}
