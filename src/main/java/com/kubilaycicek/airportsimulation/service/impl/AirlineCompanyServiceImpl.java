package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyDto;
import com.kubilaycicek.airportsimulation.exception.AirlineCompanyNotFoundException;
import com.kubilaycicek.airportsimulation.exception.AirportNotFoundException;
import com.kubilaycicek.airportsimulation.mapper.AirlineCompanyMapper;
import com.kubilaycicek.airportsimulation.model.AirlineCompany;
import com.kubilaycicek.airportsimulation.model.Airport;
import com.kubilaycicek.airportsimulation.repository.AirlineCompanyRepository;
import com.kubilaycicek.airportsimulation.repository.AirportRepository;
import com.kubilaycicek.airportsimulation.service.AirlineCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineCompanyServiceImpl implements AirlineCompanyService {

    @Autowired
    AirlineCompanyRepository airlineCompanyRepository;

    @Autowired
    AirportRepository airportRepository;

    @Autowired
    AirlineCompanyMapper airlineCompanyMapper;

    @Override
    public AirlineCompanyDto addAirline(AirlineCompanyDto airlineCompanyDto) {

        Airport airport = airportRepository.findById(airlineCompanyDto.getAirportDto().getId())
                .orElseThrow(() -> new AirportNotFoundException("Airport " + airlineCompanyDto.getAirportDto().getId() + " does not exist !"));

        AirlineCompany airlineCompany = airlineCompanyMapper.toAirlineCompany(airlineCompanyDto);
        airlineCompany.setAirport(airport);

        return airlineCompanyMapper.toAirlineCompanyDto(airlineCompanyRepository.save(airlineCompany));
    }

    @Override
    public AirlineCompanyDto updateAirline(AirlineCompanyDto airlineCompanyDto) {

        Airport airport = airportRepository.findById(airlineCompanyDto.getAirportDto().getId())
                .orElseThrow(() -> new AirportNotFoundException("Airport " + airlineCompanyDto.getAirportDto().getId() + " does not exist !"));

        AirlineCompany airlineCompanyDb = airlineCompanyRepository.findById(airlineCompanyDto.getId())
                .orElseThrow(() -> new AirlineCompanyNotFoundException("Airline Company " + airlineCompanyDto.getId() + " does not exist!"));

        airlineCompanyDb.setName(airlineCompanyDto.getName());
        airlineCompanyDb.setDescription(airlineCompanyDto.getDescription());
        airlineCompanyDb.setAirport(airport);

        return airlineCompanyMapper.toAirlineCompanyDto(airlineCompanyRepository.save(airlineCompanyDb));
    }

    @Override
    public AirlineCompanyDto findById(long id) {
        return airlineCompanyMapper.toAirlineCompanyDto(airlineCompanyRepository.findById(id)
                .orElseThrow(() -> new AirlineCompanyNotFoundException("Airline Company " + id + " does not exist !")));
    }

    @Override
    public AirlineCompanyDto findByName(String name) {
        return airlineCompanyMapper.toAirlineCompanyDto(airlineCompanyRepository.findByName(name)
                .orElseThrow(() -> new AirlineCompanyNotFoundException("Airline Company " + name + " does not exist !")));

    }

    @Override
    public void removeById(long id) {
        airlineCompanyRepository.deleteById(id);
    }

    @Override
    public List<AirlineCompanyDto> findAll() {
        return airlineCompanyMapper.toAirlineCompanyDtoList(airlineCompanyRepository.findAll());
    }
}
