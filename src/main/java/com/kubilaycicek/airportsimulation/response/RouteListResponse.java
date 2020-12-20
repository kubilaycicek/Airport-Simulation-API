package com.kubilaycicek.airportsimulation.response;

import com.kubilaycicek.airportsimulation.dto.RouteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteListResponse {
    private List<RouteDto> routeDtoList;
}