package com.kubilaycicek.airportsimulation.service;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import com.kubilaycicek.airportsimulation.model.Airport;

import java.util.List;

public interface AirportService {
    AirportDto addAirport(AirportDto airportDto);
    AirportDto updateAirport(AirportDto airportDto);
    AirportDto findById(long id);
    AirportDto findByName(String name);
    void removeById(long id);
    List<AirportDto> findAll();
}