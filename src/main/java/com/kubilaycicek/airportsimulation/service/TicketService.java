package com.kubilaycicek.airportsimulation.service;

import com.kubilaycicek.airportsimulation.dto.TicketDto;

import java.util.List;

public interface TicketService {
    TicketDto addTicket(TicketDto ticketDto);
    TicketDto updateTicket(TicketDto ticketDto);
    TicketDto findById(long id);
    TicketDto findByTicketNumber(long ticketNumber);
    void removeById(long id);
    List<TicketDto> findAll();
}
