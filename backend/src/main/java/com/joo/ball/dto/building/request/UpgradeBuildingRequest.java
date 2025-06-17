package com.joo.ball.dto.building.request;

import com.joo.ball.util.enums.BuildingType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UpgradeBuildingRequest {

    private BuildingType buildingType;
    private Integer upgradeLevel;
}
