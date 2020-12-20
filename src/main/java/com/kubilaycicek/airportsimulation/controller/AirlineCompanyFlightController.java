package com.kubilaycicek.airportsimulation.controller;

import com.kubilaycicek.airportsimulation.request.AirlineCompanyFlightRequest;
import com.kubilaycicek.airportsimulation.response.AirlineCompanyFlightListResponse;
import com.kubilaycicek.airportsimulation.response.AirlineCompanyFlightResponse;
import com.kubilaycicek.airportsimulation.service.AirlineCompanyFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/airline-company-flight")
public class AirlineCompanyFlightController {

    @Autowired
    AirlineCompanyFlightService airlineCompanyFlightService;

    @PostMapping
    public AirlineCompanyFlightResponse addAirlineCompanyFlight(@RequestBody AirlineCompanyFlightRequest airlineCompanyFlightRequest) {
        return new AirlineCompanyFlightResponse(airlineCompanyFlightService
                .addAirlineCompanyFlight(airlineCompanyFlightRequest.getAirlineCompanyFlightDto()));
    }

    @PutMapping
    public AirlineCompanyFlightResponse updateAirlineCompanyFlight(@RequestBody AirlineCompanyFlightRequest airlineCompanyFlightRequest) {
        return new AirlineCompanyFlightResponse(airlineCompanyFlightService
                .updateAirlineCompanyFlight(airlineCompanyFlightRequest.getAirlineCompanyFlightDto()));
    }

    @GetMapping("/{id}")
    public AirlineCompanyFlightResponse getById(@PathVariable(name = "{id}") Long id) {
        return new AirlineCompanyFlightResponse(airlineCompanyFlightService.findById(id));
    }

    @GetMapping("/list")
    public AirlineCompanyFlightListResponse getList(@PathVariable(name = "{id}") Long id) {
        return new AirlineCompanyFlightListResponse(airlineCompanyFlightService.findAll());
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(name = "{id}") Long id) {
        airlineCompanyFlightService.removeById(id);
    }
}
