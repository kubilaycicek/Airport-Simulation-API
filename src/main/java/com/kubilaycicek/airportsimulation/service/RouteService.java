package com.kubilaycicek.airportsimulation.service;

import com.kubilaycicek.airportsimulation.dto.RouteDto;

import java.util.List;

public interface RouteService {
    RouteDto addRoute(RouteDto routeDto);
    RouteDto updateRoute(RouteDto routeDto);
    RouteDto findById(long id);
    RouteDto findByName(String name);
    void removeById(long id);
    List<RouteDto> findAll();
}
