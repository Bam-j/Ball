package com.joo.ball.controller.main;

import com.joo.ball.dto.main.response.MainPageInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
@RequiredArgsConstructor
public class MainController {

    private final MainPageService mainPageService;

    @GetMapping("/")
    public ResponseEntity<MainPageInfoResponse> getMainPageInfo() {
        MainPageInfoResponse response = mainPageService.getMainPageInfo();
        return ResponseEntity.ok(response);
    }
}
