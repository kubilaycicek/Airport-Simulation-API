package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineCompanyListResponse {
    private List<AirlineCompanyDto> airlineCompanyDtoList;
}