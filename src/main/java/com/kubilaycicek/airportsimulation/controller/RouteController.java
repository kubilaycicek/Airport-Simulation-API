package com.kubilaycicek.airportsimulation.controller;

import com.kubilaycicek.airportsimulation.request.RouteRequest;
import com.kubilaycicek.airportsimulation.response.RouteListResponse;
import com.kubilaycicek.airportsimulation.response.RouteResponse;
import com.kubilaycicek.airportsimulation.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    RouteService routeService;

    @PostMapping
    public RouteResponse addRoute(@RequestBody RouteRequest routeRequest) {
        return new RouteResponse(routeService.addRoute(routeRequest.getRouteDto()));
    }

    @PutMapping
    public RouteResponse updateRoute(@RequestBody RouteRequest routeRequest) {
        return new RouteResponse(routeService.updateRoute(routeRequest.getRouteDto()));
    }

    @GetMapping("/{id}")
    public RouteResponse getById(@PathVariable(name = "{id}") Long id) {
        return new RouteResponse(routeService.findById(id));
    }

    @GetMapping("/name/{name}")
    public RouteResponse getByName(@PathVariable(name = "{name}")  String name) {
        return new RouteResponse(routeService.findByName(name));
    }

    @GetMapping("/list")
    public RouteListResponse getList() {
        return new RouteListResponse(routeService.findAll());
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(name = "{id}") Long id) {
        routeService.removeById(id);
    }
}