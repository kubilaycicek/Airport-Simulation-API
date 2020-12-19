package com.kubilaycicek.airportsimulation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineCompanyDto extends BaseDto {

    private long id;

    private String name;

    private String description;

    private AirportDto airportDto;

    private List<AirlineCompanyFlightDto> airlineCompanyFlightDtoList = new ArrayList<>();
}