package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import com.kubilaycicek.airportsimulation.exception.AirportNotFoundException;
import com.kubilaycicek.airportsimulation.mapper.AirportMapper;
import com.kubilaycicek.airportsimulation.model.Airport;
import com.kubilaycicek.airportsimulation.repository.AirportRepository;
import com.kubilaycicek.airportsimulation.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private AirportMapper airportMapper;

    @Override
    public AirportDto addAirport(AirportDto airportDto) {
        return airportMapper.toAirportDto(airportRepository.save(airportMapper.toAirport(airportDto)));
    }

    @Override
    public AirportDto updateAirport(AirportDto airportDto) {
        Airport airportDb = airportRepository.findById(airportDto.getId())
                .orElseThrow(() -> new AirportNotFoundException("Airport " + airportDto.getId() + " does not exist !"));
        airportDb.setName(airportDto.getName());
        airportDb.setDescription(airportDto.getDescription());
        return airportMapper.toAirportDto(airportRepository.save(airportDb));
    }

    @Override
    public AirportDto findById(long id) {
        return airportMapper.toAirportDto(airportRepository.findById(id)
                .orElseThrow(() -> new AirportNotFoundException("Airport " + id + " does not exist !")));
    }

    @Override
    public AirportDto findByName(String name) {
        return airportMapper.toAirportDto(airportRepository.findByName(name)
                .orElseThrow(() -> new AirportNotFoundException("Airport " + name + " does not exist !")));
    }

    @Override
    public void removeById(long id) {
        airportRepository.deleteById(id);
    }

    @Override
    public List<AirportDto> findAllAirportList() {
        return airportMapper.toAirportDtoList(airportRepository.findAll());
    }
}
