package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineCompanyFlightListResponse {
    private List<AirlineCompanyFlightDto> flightDtoList;
}