package com.kubilaycicek.airportsimulation.request;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportRequest {
    private AirportDto airportDto;
}