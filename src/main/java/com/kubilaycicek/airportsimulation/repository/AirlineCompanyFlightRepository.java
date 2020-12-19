package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.AirlineCompanyFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirlineCompanyFlightRepository extends JpaRepository<AirlineCompanyFlight, Long> {
    Optional<AirlineCompanyFlight> findById(long id);
    Optional<AirlineCompanyFlight> findByName(String name);
}