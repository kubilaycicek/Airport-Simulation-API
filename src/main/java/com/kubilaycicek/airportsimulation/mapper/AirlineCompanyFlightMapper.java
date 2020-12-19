package com.kubilaycicek.airportsimulation.mapper;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyFlightDto;
import com.kubilaycicek.airportsimulation.model.AirlineCompanyFlight;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AirlineCompanyFlightMapper {
    @Named("toAirlineCompanyFlight")
    AirlineCompanyFlight toAirlineCompanyFlight(AirlineCompanyFlightDto airlineCompanyFlightDto);

    @Named("toAirlineCompanyFlightDto")
    AirlineCompanyFlightDto toAirlineCompanyFlightDto(AirlineCompanyFlight airlineCompanyFlight);

    @IterableMapping(qualifiedByName = "toAirlineCompanyFlightList")
    List<AirlineCompanyFlight> toAirlineCompanyFlightList(List<AirlineCompanyFlightDto> airlineCompanyFlightDtoList);

    @IterableMapping(qualifiedByName = "toAirlineCompanyFlightDtoList")
    List<AirlineCompanyFlightDto> toAirlineCompanyFlightDtoList(List<AirlineCompanyFlight>  airlineCompanyFlightList);
}
