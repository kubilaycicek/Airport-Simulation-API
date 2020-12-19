package com.kubilaycicek.airportsimulation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Route")
public class Route extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_generator")
    @SequenceGenerator(name = "route_generator", sequenceName = "route_sequence")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "name", length = 150, unique = true)
    private String name;

    @Column(name = "distance")
    private String distance;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = AirlineCompanyFlight.class, mappedBy = "route")
    private List<AirlineCompanyFlight> airlineCompanyFlight;
}