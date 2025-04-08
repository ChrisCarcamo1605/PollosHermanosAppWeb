package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.TicketDetail;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ITicketDetailService;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.TicketDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketDetailService implements ITicketDetailService {
    @Autowired
    TicketDetailRepository ticketDetailRepository;

    @Override
    public TicketDetail getTicketDetail(){return null;}

    @Override
    public TicketDetail saveTicketDetail(TicketDetail ticketDetail){return ticketDetailRepository.save(ticketDetail);}


}
