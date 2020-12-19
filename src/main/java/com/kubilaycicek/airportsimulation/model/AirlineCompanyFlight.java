package com.kubilaycicek.airportsimulation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AirlineCompanyFlight")
public class AirlineCompanyFlight extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airline_company_flight_generator")
    @SequenceGenerator(name = "airline_company_flight_generator", sequenceName = "airline_company_flight_sequence")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "flight_date")
    private Date flightDate;

    @Column(name = "quota")
    private long quota;

    @Column(name = "price")
    private double price;

    @JsonIgnore
    @ManyToOne(targetEntity = Route.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = AirlineCompany.class)
    @JoinColumn(name = "airplane_company_id")
    private AirlineCompany airlineCompany;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Ticket.class)
    private List<Ticket> ticketList = new ArrayList<>();
}