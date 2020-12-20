package com.kubilaycicek.airportsimulation.request;

import com.kubilaycicek.airportsimulation.dto.TicketDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequest {
    private TicketDto ticketDto;
}