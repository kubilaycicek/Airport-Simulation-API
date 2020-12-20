package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.TicketDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketListResponse {
    private List<TicketDto> ticketDtoList;
}