package com.kubilaycicek.airportsimulation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto extends BaseDto {

    private long id;

    private long ticketNumber;

    private String name;

    private String surname;

    private Double price;

    private String CreditCardNumber;

    private AirlineCompanyFlightDto airlineCompanyFlightDto;
}