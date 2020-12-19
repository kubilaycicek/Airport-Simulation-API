package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
    Optional<Route> findById(long id);
    Optional<Route> findByName(String name);
}