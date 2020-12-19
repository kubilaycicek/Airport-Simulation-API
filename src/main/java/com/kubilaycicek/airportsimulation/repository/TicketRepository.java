package com.kubilaycicek.airportsimulation.repository;

import com.kubilaycicek.airportsimulation.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findByTicketNumber(long ticketNumber);
    Optional<Ticket> findById(long id);
}