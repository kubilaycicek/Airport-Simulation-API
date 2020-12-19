package com.kubilaycicek.airportsimulation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportDto extends BaseDto {

    private long id;

    private String name;

    private String description;

    private List<AirlineCompanyDto> airlineCompanyList = new ArrayList<>();
}