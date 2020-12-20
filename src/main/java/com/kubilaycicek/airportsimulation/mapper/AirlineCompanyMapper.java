package com.kubilaycicek.airportsimulation.mapper;

import com.kubilaycicek.airportsimulation.dto.AirlineCompanyDto;
import com.kubilaycicek.airportsimulation.model.AirlineCompany;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AirlineCompanyMapper {
    @Named("toAirlineCompany")
    AirlineCompany toAirlineCompany(AirlineCompanyDto airlineCompanyDto);

    @Named("toAirlineCompanyDto")
    AirlineCompanyDto toAirlineCompanyDto(AirlineCompany airlineCompany);

    @IterableMapping(qualifiedByName = "toAirlineCompanyList")
    List<AirlineCompany> toAirlineCompanyList(List<AirlineCompanyDto> airlineCompanyDtoList);

    @IterableMapping(qualifiedByName = "toAirlineCompanyDtoList")
    List<AirlineCompanyDto> toAirlineCompanyDtoList(List<AirlineCompany>  airlineCompanyList);
}
