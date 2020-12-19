package com.kubilaycicek.airportsimulation.model;

import lombok.Data;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
}
