package com.kubilaycicek.airportsimulation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AirlineCompanyFlightNotFoundException extends RuntimeException {
    public AirlineCompanyFlightNotFoundException(String message){
        super(message);
    }
}
