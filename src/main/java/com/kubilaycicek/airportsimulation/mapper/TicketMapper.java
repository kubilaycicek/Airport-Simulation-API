package com.kubilaycicek.airportsimulation.mapper;

import com.kubilaycicek.airportsimulation.dto.TicketDto;
import com.kubilaycicek.airportsimulation.model.Ticket;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    @Named("toTicket")
    Ticket toTicket(TicketDto ticketDto);

    @Named("toTicketDto")
    TicketDto toTicketDto(Ticket ticket);

    @IterableMapping(qualifiedByName = "toTicketList")
    List<Ticket> toTicketList(List<TicketDto> ticketDtoList);

    @IterableMapping(qualifiedByName = "toTicketDtoList")
    List<TicketDto> toTicketDtoList(List<Ticket> ticketList);
}
