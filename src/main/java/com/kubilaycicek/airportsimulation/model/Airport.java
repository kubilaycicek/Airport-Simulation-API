package com.kubilaycicek.airportsimulation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Airport")
public class Airport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airport_generator")
    @SequenceGenerator(name = "airport_generator", sequenceName = "airport_sequence")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "name", length = 150, unique = true)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @JsonIgnore
    @OneToMany(targetEntity = AirlineCompany.class, mappedBy = "airport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AirlineCompany> airlineCompanyList = new ArrayList<>();
}