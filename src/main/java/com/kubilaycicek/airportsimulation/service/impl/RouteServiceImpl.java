package com.kubilaycicek.airportsimulation.service.impl;

import com.kubilaycicek.airportsimulation.constants.StringConstants;
import com.kubilaycicek.airportsimulation.dto.RouteDto;
import com.kubilaycicek.airportsimulation.exception.RouteNotFoundException;
import com.kubilaycicek.airportsimulation.mapper.RouteMapper;
import com.kubilaycicek.airportsimulation.model.Route;
import com.kubilaycicek.airportsimulation.repository.RouteRepository;
import com.kubilaycicek.airportsimulation.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    RouteMapper routeMapper;

    @Autowired
    RouteRepository routeRepository;

    @Override
    public RouteDto addRoute(RouteDto routeDto) {
        return routeMapper.toRouteDto(routeRepository.save(routeMapper.toRoute(routeDto)));
    }

    @Override
    public RouteDto updateRoute(RouteDto routeDto) {
        Route routeDb = routeRepository.findById(routeDto.getId())
                .orElseThrow(() -> new RouteNotFoundException(StringConstants.ROUTE + routeDto.getId() + StringConstants.DOES_NOT_EXIST));
        routeDb.setName(routeDto.getName());
        routeDb.setDistance(routeDto.getDistance());
        return routeMapper.toRouteDto(routeRepository.save(routeDb));
    }

    @Override
    public RouteDto findById(long id) {
        return routeMapper.toRouteDto(routeRepository.findById(id)
                .orElseThrow(() -> new RouteNotFoundException(StringConstants.ROUTE + id + StringConstants.DOES_NOT_EXIST)));
    }

    @Override
    public RouteDto findByName(String name) {
        return routeMapper.toRouteDto(routeRepository.findByName(name)
                .orElseThrow(() -> new RouteNotFoundException(StringConstants.ROUTE + name  + StringConstants.DOES_NOT_EXIST)));
    }

    @Override
    public void removeById(long id) {
        routeRepository.deleteById(id);
    }

    @Override
    public List<RouteDto> findAll() {
        return routeMapper.toRouteDtoList(routeRepository.findAll());
    }
}
