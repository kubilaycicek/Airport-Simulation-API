package com.kubilaycicek.airportsimulation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_generator")
    @SequenceGenerator(name = "ticket_generator", sequenceName = "ticket_sequence")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "ticketNumber")
    private long ticketNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "price")
    private Double price;

    @Column(name = "creditCardNumber")
    private String CreditCardNumber;

    @JsonIgnore
    @ManyToOne(targetEntity = AirlineCompanyFlight.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "airplane_company_flight_id")
    private AirlineCompanyFlight airlineCompanyFlight;
}