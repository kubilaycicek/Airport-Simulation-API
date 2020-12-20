package com.kubilaycicek.airportsimulation.controller;

import com.kubilaycicek.airportsimulation.request.AirportRequest;
import com.kubilaycicek.airportsimulation.response.AirportListResponse;
import com.kubilaycicek.airportsimulation.response.AirportResponse;
import com.kubilaycicek.airportsimulation.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/airport")
public class AirportController {

    @Autowired
    AirportService airportService;

    @PostMapping
    public AirportResponse addAirport(@RequestBody AirportRequest airportRequest) {
        return new AirportResponse(airportService.addAirport(airportRequest.getAirportDto()));
    }

    @PutMapping
    public AirportResponse updateAirport(@RequestBody AirportRequest airportRequest) {
        return new AirportResponse(airportService.addAirport(airportRequest.getAirportDto()));
    }

    @GetMapping("/{id}")
    public AirportResponse getById(@PathVariable(name = "{id}") Long id) {
        return new AirportResponse(airportService.findById(id));
    }

    @GetMapping("/name/{name}")
    public AirportResponse getByName(@PathVariable(name = "{name}") String name) {
        return new AirportResponse(airportService.findByName(name));
    }

    @GetMapping("/list")
    public AirportListResponse getList() {
        return new AirportListResponse(airportService.findAll());
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(name = "{id}") Long id) {
        airportService.removeById(id);
    }
}