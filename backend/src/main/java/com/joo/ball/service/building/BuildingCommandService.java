package com.joo.ball.service.building;

import com.joo.ball.dto.building.request.PurchaseBuildingRequest;
import com.joo.ball.dto.building.request.UpgradeBuildingRequest;
import org.springframework.stereotype.Service;

@Service
public class BuildingCommandService {
    public void purchaseBuilding(PurchaseBuildingRequest purchaseBuildingRequest) {
        /*
        * 건물 첫 구매
        * 1. 건물 생성(유저와 연관관계 연결)
        * 2. 그에 따른 초 당 auto 클릭 수 등 계산
        * 3. 회원의 current_clicks 갱신
         */
    }

    public void upgradeBuilding(UpgradeBuildingRequest upgradeBuildingRequest) {
        /*
        * 건물 업그레이드
        * 1. 요청 받은 수 만큼 건물 업그레이드
        * 2. 그에 따른 초 당 클릭 수 계산
        * 3. 회원의 current_clicks 갱신
         */
    }
}
