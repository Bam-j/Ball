package com.joo.ball.controller.main;

import com.joo.ball.dto.main.response.MainPageInfoResponse;
import com.joo.ball.service.main.MainPageQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
@RequiredArgsConstructor
public class MainController {

    private final MainPageQueryService mainPageQueryService;

    @GetMapping("/")
    public ResponseEntity<MainPageInfoResponse> getMainPageInfo() {
        MainPageInfoResponse response = mainPageQueryService.getMainPageInfo();
        return ResponseEntity.ok(response);
    }
}
