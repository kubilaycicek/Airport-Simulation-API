package com.kubilaycicek.airportsimulation.request;

import com.kubilaycicek.airportsimulation.dto.RouteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteRequest {
    private RouteDto routeDto;
}