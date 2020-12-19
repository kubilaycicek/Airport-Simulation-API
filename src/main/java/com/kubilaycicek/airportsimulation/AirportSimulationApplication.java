package com.kubilaycicek.airportsimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AirportSimulationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirportSimulationApplication.class, args);
    }

}