package com.kubilaycicek.airportsimulation.dto;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseDto implements Serializable {
    private boolean status;
}
