package com.kubilaycicek.airportsimulation.request;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirlineCompanyRequest {
    private AirlineCompanyDto airlineCompanyDto;
}
