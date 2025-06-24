package com.joo.ball.service.auth;

import com.joo.ball.dto.auth.request.SignInRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthQueryService {
    public String authenticateUser(SignInRequest signInRequest) {
        /*
         * 회원 인증
         * 1. DTO에 입력된 password 암호화하여 DB에 저장된 암호와 비교
         * 2. 성공 시 토큰 생성 및 반환
         * 3. 실패 시 실패 응답 전달
         */
    }
}
