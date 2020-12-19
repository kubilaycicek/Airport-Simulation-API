package com.kubilaycicek.airportsimulation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteDto extends BaseDto {

    private long id;

    private String name;

    private String distance;

    private List<AirlineCompanyFlightDto> airlineCompanyFlightDtoList;
}