package com.kubilaycicek.airportsimulation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AirplaneCompany")
public class AirlineCompany extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airplane_company_generator")
    @SequenceGenerator(name = "airplane_company_generator", sequenceName = "airplane_company_sequence")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "name", unique = true, length = 150)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne(targetEntity = Airport.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Airport airport;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = AirlineCompanyFlight.class, mappedBy = "airlineCompany")
    private List<AirlineCompanyFlight> airlineCompanyFlightList = new ArrayList<>();
}