package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.TicketDetail;

public interface ITicketDetailService {

    public TicketDetail getTicketDetail();

    public  TicketDetail saveTicketDetail(TicketDetail ticketDetail);

}
