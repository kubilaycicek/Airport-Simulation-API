package com.kubilaycicek.airportsimulation.controller;

import com.kubilaycicek.airportsimulation.request.TicketRequest;
import com.kubilaycicek.airportsimulation.response.TicketListResponse;
import com.kubilaycicek.airportsimulation.response.TicketResponse;
import com.kubilaycicek.airportsimulation.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping
    public TicketResponse addTicket(@RequestBody TicketRequest ticketRequest) {
        return new TicketResponse(ticketService.addTicket(ticketRequest.getTicketDto()));
    }

    @PutMapping
    public TicketResponse updateTicket(@RequestBody TicketRequest ticketRequest) {
        return new TicketResponse(ticketService.updateTicket(ticketRequest.getTicketDto()));
    }

    @GetMapping("/{id}")
    public TicketResponse getById(@PathVariable(name = "{id}") Long id) {
        return new TicketResponse(ticketService.findById(id));
    }

    @GetMapping("/ticketNumber/{ticketNumber}")
    public TicketResponse getByTicketNumber(@PathVariable(name = "{ticketNumber}") Long ticketNumber) {
        return new TicketResponse(ticketService.findByTicketNumber(ticketNumber));
    }

    @GetMapping("/list")
    public TicketListResponse getList() {
        return new TicketListResponse(ticketService.findAll());
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(name = "{id}") Long id) {
        ticketService.removeById(id);
    }
}