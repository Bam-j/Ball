package com.joo.ball.controller.building;

import com.joo.ball.dto.building.request.PurchaseBuildingRequest;
import com.joo.ball.dto.building.request.UpgradeBuildingRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/buildings")
@RequiredArgsConstructor
public class BuildingController {

    private final BuildingCommandService buildingCommandService;

    @PostMapping("/")
    public ResponseEntity<Void> purchaseBuilding(@RequestBody PurchaseBuildingRequest purchaseBuildingRequest) {
        buildingCommandService.purchaseBuilding(purchaseBuildingRequest);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/upgrade")
    public ResponseEntity<Void> upgradeBuilding(@RequestBody UpgradeBuildingRequest upgradeBuildingRequest) {
        buildingCommandService.upgradeBuilding(upgradeBuildingRequest);
        return ResponseEntity.noContent().build();
    }
}
