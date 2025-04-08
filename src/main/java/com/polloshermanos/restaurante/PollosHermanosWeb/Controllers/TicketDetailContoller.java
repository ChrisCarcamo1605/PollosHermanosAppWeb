package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.TicketDetail;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveTicketDetail;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ITicketDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticketDetail")
public class TicketDetailContoller {

    @Autowired
    ITicketDetailService ticketDetailService;

    @PostMapping
    public void imprimiMundo(DtoSaveTicketDetail ticketDetail){
        System.out.println("Hola Mundo");

        var newTicketDetail = new TicketDetail();
        newTicketDetail.setSubTotal(ticketDetail.subTotal());
        ticketDetailService.saveTicketDetail(newTicketDetail);
    }
}
