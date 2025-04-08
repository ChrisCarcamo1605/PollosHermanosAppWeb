package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ticket;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ITicketService;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService implements ITicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getTicket() {return null;}

    @Override
    public Ticket saveTicket(Ticket ticket){return ticketRepository.save(ticket);}
}
