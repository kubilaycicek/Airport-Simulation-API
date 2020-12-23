package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.constants.StringConstants;
import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;
import com.kubilaycicek.airportsimulation.exception.AirlineCompanyFlightNotFoundException;
import com.kubilaycicek.airportsimulation.exception.RouteNotFoundException;
import com.kubilaycicek.airportsimulation.mapper.AirlineCompanyFlightMapper;
import com.kubilaycicek.airportsimulation.model.AirlineCompanyFlight;
import com.kubilaycicek.airportsimulation.repository.AirlineCompanyFlightRepository;
import com.kubilaycicek.airportsimulation.repository.AirlineCompanyRepository;
import com.kubilaycicek.airportsimulation.repository.RouteRepository;
import com.kubilaycicek.airportsimulation.service.AirlineCompanyFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineCompanyFlightServiceImpl implements AirlineCompanyFlightService {

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    AirlineCompanyRepository airlineCompanyRepository;
    
    @Autowired
    AirlineCompanyFlightMapper airlineCompanyFlightMapper;

    @Autowired
    AirlineCompanyFlightRepository airlineCompanyFlightRepository;

    @Override
    public AirlineCompanyFlightDto addAirlineCompanyFlight(AirlineCompanyFlightDto airlineCompanyFlightDto) {

        AirlineCompanyFlight airlineCompanyFlight = airlineCompanyFlightMapper.toAirlineCompanyFlight(airlineCompanyFlightDto);

        airlineCompanyFlight.setAirlineCompany(airlineCompanyRepository.findById(airlineCompanyFlightDto.getAirlineCompanyDto().getId())
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY + airlineCompanyFlightDto.getAirlineCompanyDto().getId() + StringConstants.DOES_NOT_EXIST)));

        airlineCompanyFlight.setRoute(routeRepository.findById(airlineCompanyFlightDto.getRouteDto().getId())
                .orElseThrow(() -> new RouteNotFoundException(StringConstants.ROUTE + airlineCompanyFlightDto.getRouteDto().getId() + StringConstants.DOES_NOT_EXIST)));

        return airlineCompanyFlightMapper.toAirlineCompanyFlightDto(airlineCompanyFlightRepository.save(airlineCompanyFlight));
    }

    @Override
    public AirlineCompanyFlightDto updateAirlineCompanyFlight(AirlineCompanyFlightDto airlineCompanyFlightDto) {

        AirlineCompanyFlight airlineCompanyFlightDb = airlineCompanyFlightRepository.findById(airlineCompanyFlightDto.getId())
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY_FLIGHT + airlineCompanyFlightDto.getId() + StringConstants.DOES_NOT_EXIST));

        airlineCompanyFlightDb.setAirlineCompany(airlineCompanyRepository.findById(airlineCompanyFlightDto.getAirlineCompanyDto().getId())
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY + airlineCompanyFlightDto.getAirlineCompanyDto().getId() + StringConstants.DOES_NOT_EXIST)));

        airlineCompanyFlightDb.setRoute(routeRepository.findById(airlineCompanyFlightDto.getRouteDto().getId())
                .orElseThrow(() -> new RouteNotFoundException(StringConstants.ROUTE + airlineCompanyFlightDto.getRouteDto().getId() + StringConstants.DOES_NOT_EXIST)));

        airlineCompanyFlightDb.setCode(airlineCompanyFlightDto.getCode());
        airlineCompanyFlightDb.setName(airlineCompanyFlightDto.getName());
        airlineCompanyFlightDb.setPrice(airlineCompanyFlightDto.getPrice());
        airlineCompanyFlightDb.setQuota(airlineCompanyFlightDto.getQuota());
        airlineCompanyFlightDb.setFlightDate(airlineCompanyFlightDto.getFlightDate());
        airlineCompanyFlightDb.setStatus(airlineCompanyFlightDto.isStatus());

        return airlineCompanyFlightMapper.toAirlineCompanyFlightDto(airlineCompanyFlightRepository.save(airlineCompanyFlightDb));
    }

    @Override
    public AirlineCompanyFlightDto findById(long id) {
        return airlineCompanyFlightMapper.toAirlineCompanyFlightDto(airlineCompanyFlightRepository.findById(id)
                .orElseThrow(() -> new AirlineCompanyFlightNotFoundException(StringConstants.AIRLINE_COMPANY_FLIGHT + id + StringConstants.DOES_NOT_EXIST)));
    }

    @Override
    public void removeById(long id) {
        airlineCompanyFlightRepository.deleteById(id);
    }

    @Override
    public List<AirlineCompanyFlightDto> findAll() {
        return airlineCompanyFlightMapper.toAirlineCompanyFlightDtoList(airlineCompanyFlightRepository.findAll());
    }
}
