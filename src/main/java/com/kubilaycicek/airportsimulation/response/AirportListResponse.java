package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportListResponse {
    private List<AirportDto> airportDtoList;
}