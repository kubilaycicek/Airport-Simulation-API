package com.kubilaycicek.airportsimulation.controller;

import com.kubilaycicek.airportsimulation.request.AirlineCompanyRequest;
import com.kubilaycicek.airportsimulation.response.AirlineCompanyListResponse;
import com.kubilaycicek.airportsimulation.response.AirlineCompanyResponse;
import com.kubilaycicek.airportsimulation.service.AirlineCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline-company")
public class AirlineCompanyController {
    @Autowired
    AirlineCompanyService airlineCompanyService;

    @PostMapping
    public AirlineCompanyResponse addAirlineCompany(@RequestBody AirlineCompanyRequest airlineCompanyRequest) {
        return new AirlineCompanyResponse(airlineCompanyService.addAirline(airlineCompanyRequest.getAirlineCompanyDto()));
    }

    @PutMapping
    public AirlineCompanyResponse updateAirlineCompany(@RequestBody AirlineCompanyRequest airlineCompanyRequest) {
        return new AirlineCompanyResponse(airlineCompanyService.updateAirline(airlineCompanyRequest.getAirlineCompanyDto()));
    }

    @GetMapping("/{id}")
    public AirlineCompanyResponse getById(@PathVariable(name = "{id}") Long id) {
        return new AirlineCompanyResponse(airlineCompanyService.findById(id));
    }

    @GetMapping("/name/{name}")
    public AirlineCompanyResponse getByName(@PathVariable(name = "{name}") String name) {
        return new AirlineCompanyResponse(airlineCompanyService.findByName(name));
    }

    @GetMapping("/list")
    public AirlineCompanyListResponse getList() {
        return new AirlineCompanyListResponse(airlineCompanyService.findAll());
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(name = "{id}") Long id) {
        airlineCompanyService.removeById(id);
    }
}