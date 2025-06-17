package com.joo.ball.dto.main.response;

import com.joo.ball.dto.building.response.BuildingInfoResponse;
import com.joo.ball.dto.user.response.UserClicksInfoResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MainPageInfoResponse {

    private String username;
    private UserClicksInfoResponse userClicksInfoResponse;
    List<BuildingInfoResponse> buildingInfoList;
}
