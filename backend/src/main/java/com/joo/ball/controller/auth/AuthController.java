package com.joo.ball.controller.auth;

import com.joo.ball.dto.auth.request.SignInRequest;
import com.joo.ball.dto.auth.request.SignUpRequest;
import com.joo.ball.service.auth.AuthCommandService;
import com.joo.ball.service.auth.AuthQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthCommandService authCommandService;
    private final AuthQueryService authQueryService;

    @PostMapping("/sign-up")
    public ResponseEntity<Object> createUser(@RequestBody SignUpRequest signUpRequest) {
        authCommandService.createUser(signUpRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/sign-in")
    public ResponseEntity<Object> authenticateUser(@RequestBody SignInRequest signInRequest) {
        String token = authQueryService.authenticateUser(signInRequest);
        return ResponseEntity.ok(Map.of("token", token));
    }
}
