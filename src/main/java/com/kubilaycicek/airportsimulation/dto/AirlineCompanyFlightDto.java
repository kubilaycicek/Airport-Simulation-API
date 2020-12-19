package com.kubilaycicek.airportsimulation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineCompanyFlightDto extends BaseDto {

    private long id;

    private String code;

    private Date flightDate;

    private long quota;

    private double price;

    private RouteDto routeDto;

    private AirlineCompanyDto airlineCompanyDto;

    private List<TicketDto> ticketDtoList = new ArrayList<>();
}