package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany, Long> {
}
