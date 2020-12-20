package com.kubilaycicek.airportsimulation.request;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineCompanyFlightRequest {
    private AirlineCompanyFlightDto airlineCompanyFlightDto;
}
