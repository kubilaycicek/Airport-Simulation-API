package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import com.kubilaycicek.airportsimulation.repository.AirportRepository;
import com.kubilaycicek.airportsimulation.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public AirportDto addAirport(AirportDto airportDto) {
        return null;
    }

    @Override
    public AirportDto updateAirport(AirportDto airportDto) {
        return null;
    }

    @Override
    public AirportDto findById(long id) {
        return null;
    }

    @Override
    public AirportDto findByName(String name) {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

    @Override
    public List<AirportDto> findAllAirportList() {
        return null;
    }
}
