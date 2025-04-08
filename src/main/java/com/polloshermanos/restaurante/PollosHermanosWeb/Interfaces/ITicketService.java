package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ticket;

public interface ITicketService {

    public Ticket getTicket();

    public Ticket saveTicket(Ticket ticket);
}
