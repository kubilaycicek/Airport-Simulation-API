package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineCompanyFlightResponse {
    private AirlineCompanyFlightDto airlineCompanyFlightDto;
}
