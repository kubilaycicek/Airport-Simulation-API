package com.kubilaycicek.airportsimulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineCompanyFlight extends JpaRepository<AirlineCompanyFlight,Long> {
}
