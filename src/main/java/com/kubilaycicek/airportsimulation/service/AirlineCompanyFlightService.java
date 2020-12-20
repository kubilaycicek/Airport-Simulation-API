package com.kubilaycicek.airportsimulation.service;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;

import java.util.List;

public interface AirlineCompanyFlightService {
    AirlineCompanyFlightDto addAirlineCompanyFlight(AirlineCompanyFlightDto airlineCompanyFlightDto);
    AirlineCompanyFlightDto updateAirlineCompanyFlight(AirlineCompanyFlightDto airlineCompanyFlightDto);
    AirlineCompanyFlightDto findById(long id);
    void removeById(long id);
    List<AirlineCompanyFlightDto> findAll();
}