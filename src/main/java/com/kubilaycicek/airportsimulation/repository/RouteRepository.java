package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
}
