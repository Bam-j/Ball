package com.joo.ball.dto.building.response;

import com.joo.ball.util.enums.BuildingType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BuildingInfoResponse {

    private BuildingType buildingType;
    private Long buildingCount;
    private Long buildingLevel;
}
