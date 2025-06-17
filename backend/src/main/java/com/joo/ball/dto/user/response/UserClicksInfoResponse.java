package com.joo.ball.dto.user.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserClicksInfoResponse {

    private BigDecimal totalClicks;
    private BigDecimal currentClicks;
}
