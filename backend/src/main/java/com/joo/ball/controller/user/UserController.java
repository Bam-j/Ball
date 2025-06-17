package com.joo.ball.controller.user;

import com.joo.ball.dto.user.request.UpdateClicksRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserCommandService userCommandService;

    @PatchMapping("/clicks")
    public ResponseEntity<Void> updateClicks(@RequestBody UpdateClicksRequest updateClicksRequest) {
        // frontend에서 차액 만큼만 넘김
        // updateClicks에서 차액을 이용해서 current, total clicks를 갱신
        userCommandService.updateClicks(updateClicksRequest);
        return ResponseEntity.noContent().build();
    }
}
