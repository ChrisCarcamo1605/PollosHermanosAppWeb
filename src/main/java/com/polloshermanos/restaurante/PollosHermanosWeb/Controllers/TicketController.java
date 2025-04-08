package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ticket;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveTicket;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    ITicketService ticketService;

    @PostMapping
    public void imprimiMundo(DtoSaveTicket ticket){
        System.out.println("Hola Mundo");
        var newTicket = new Ticket();
        newTicket.setDate(ticket.date());
        newTicket.setHour(ticket.hour());

        ticketService.saveTicket(newTicket);
    }
}
