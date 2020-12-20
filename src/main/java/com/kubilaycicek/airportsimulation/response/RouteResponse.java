package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.RouteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteResponse {
    private RouteDto routeDto;
}
