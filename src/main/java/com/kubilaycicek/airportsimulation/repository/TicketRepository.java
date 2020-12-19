package com.kubilaycicek.airportsimulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.security.krb5.internal.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
