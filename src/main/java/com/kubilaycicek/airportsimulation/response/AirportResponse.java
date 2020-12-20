package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportResponse {
    private AirportDto airportDto;
}
