package com.joo.ball.controller.user;

import com.joo.ball.dto.user.request.WithdrawAccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountCommandService accountCommandService;

    @DeleteMapping("/withdraw")
    public ResponseEntity<Object> withdrawAccount(
        @RequestBody WithdrawAccountRequest withdrawRequest,
        @RequestHeader("Authorization") String authorization
    ) {
        String token = authorization.startsWith("Bearer ") ? authorization.substring(7) : authorization;
        accountComandService.withdrawAccount(withdrawRequest, token);
        return ResponseEntity.ok().build();
    }
}
