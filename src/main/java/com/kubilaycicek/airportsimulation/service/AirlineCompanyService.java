package com.kubilaycicek.airportsimulation.service;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyDto;

import java.util.List;

public interface AirlineCompanyService {
    AirlineCompanyDto addAirline(AirlineCompanyDto airlineCompanyDto);
    AirlineCompanyDto updateAirline(AirlineCompanyDto airlineCompanyDto);
    AirlineCompanyDto findById(long id);
    AirlineCompanyDto findByName(String name);
    void removeById(long id);
    List<AirlineCompanyDto> findAll();
}
