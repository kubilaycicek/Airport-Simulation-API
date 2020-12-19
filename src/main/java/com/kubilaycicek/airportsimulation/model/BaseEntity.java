package com.kubilaycicek.airportsimulation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(name = "status")
    private boolean status;
}
