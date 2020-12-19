package com.kubilaycicek.airportsimulation.mapper;

import com.kubilaycicek.airportsimulation.dto.AirportDto;
import com.kubilaycicek.airportsimulation.model.Airport;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AirportMapper {
    @Named("toAirport")
    Airport toAirport(AirportDto airportDto);

    @Named("toAirportDto")
    AirportDto toAirportDto(Airport airport);

    @IterableMapping(qualifiedByName = "toAirportList")
    List<Airport> toAirportList(List<AirportDto> airportDtoList);

    @IterableMapping(qualifiedByName = "toAirportDtoList")
    List<AirportDto> toAirportDtoList(List<Airport> airportList);
}
