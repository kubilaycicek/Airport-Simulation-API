package com.kubilaycicek.airportsimulation.response;


import com.kubilaycicek.airportsimulation.dto.TicketDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponse {
    private TicketDto ticketDto;
}
