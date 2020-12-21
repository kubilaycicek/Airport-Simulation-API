package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.constants.StringConstants;
import com.kubilaycicek.airportsimulation.dto.TicketDto;
import com.kubilaycicek.airportsimulation.exception.AirlineCompanyFlightNotFoundException;
import com.kubilaycicek.airportsimulation.exception.TicketNotFoundException;
import com.kubilaycicek.airportsimulation.mapper.TicketMapper;
import com.kubilaycicek.airportsimulation.model.Ticket;
import com.kubilaycicek.airportsimulation.repository.AirlineCompanyFlightRepository;
import com.kubilaycicek.airportsimulation.repository.TicketRepository;
import com.kubilaycicek.airportsimulation.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketMapper ticketMapper;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    AirlineCompanyFlightRepository airlineCompanyFlightRepository;

    @Override
    public TicketDto addTicket(TicketDto ticketDto) {
        Ticket ticket = ticketMapper.toTicket(ticketDto);
        ticket.setAirlineCompanyFlight(airlineCompanyFlightRepository.findById(ticketDto.getAirlineCompanyFlightDto().getId())
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY_FLIGHT + ticketDto.getAirlineCompanyFlightDto().getAirlineCompanyDto().getId() + " does not exist !")));
        return ticketMapper.toTicketDto(ticketRepository.save(ticket));
    }

    @Override
    public TicketDto updateTicket(TicketDto ticketDto) {
        Ticket ticketDb = ticketRepository.findById(ticketDto.getId())
                .orElseThrow(() -> new TicketNotFoundException(StringConstants.TICKET + ticketDto.getId() + StringConstants.DOES_NOT_EXIST));
        ticketDb.setStatus(ticketDto.isStatus());
        ticketDb.setCreditCardNumber(ticketDto.getCreditCardNumber());
        ticketDb.setName(ticketDto.getName());
        ticketDb.setSurname(ticketDto.getSurname());
        ticketDb.setTicketNumber(ticketDto.getTicketNumber());

        ticketDb.setAirlineCompanyFlight(airlineCompanyFlightRepository.findById(ticketDto.getAirlineCompanyFlightDto().getId())
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY_FLIGHT + ticketDto.getAirlineCompanyFlightDto().getAirlineCompanyDto().getId() + StringConstants.DOES_NOT_EXIST)));

        //Set Flight Price
        ticketDb.setTotalPrice(ticketDb.getAirlineCompanyFlight().getPrice());

        return ticketMapper.toTicketDto(ticketRepository.save(ticketDb));
    }

    @Override
    public TicketDto findById(long id) {
        return ticketMapper.toTicketDto(ticketRepository.findById(id)
                .orElseThrow(() -> new TicketNotFoundException(StringConstants.TICKET + id + StringConstants.DOES_NOT_EXIST)));
    }

    @Override
    public TicketDto findByTicketNumber(long ticketNumber) {
        return ticketMapper.toTicketDto(ticketRepository.findByTicketNumber(ticketNumber)
                .orElseThrow(() -> new TicketNotFoundException(StringConstants.TICKET + ticketNumber + StringConstants.DOES_NOT_EXIST)));
    }

    @Override
    public void removeById(long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<TicketDto> findAll() {
        return ticketMapper.toTicketDtoList(ticketRepository.findAll());
    }
}
