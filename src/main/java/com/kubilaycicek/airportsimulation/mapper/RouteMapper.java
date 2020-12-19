package com.kubilaycicek.airportsimulation.mapper;

import com.kubilaycicek.airportsimulation.dto.RouteDto;
import com.kubilaycicek.airportsimulation.model.Airport;
import com.kubilaycicek.airportsimulation.model.Route;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RouteMapper {
    @Named("toRoute")
    Route toRoute(RouteDto routeDto);

    @Named("toRouteDto")
    RouteDto toRouteDto(Route route);

    @IterableMapping(qualifiedByName = "toRouteList")
    List<Route> toRouteList(List<RouteDto> routeDtoList);

    @IterableMapping(qualifiedByName = "toRouteDtoList")
    List<RouteDto> toRouteDtoList(List<Route> routeList);
}
