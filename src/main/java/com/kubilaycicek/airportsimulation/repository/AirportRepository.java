package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
    Optional<Airport> findByName(String name);
}