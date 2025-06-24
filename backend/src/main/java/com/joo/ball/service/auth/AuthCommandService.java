package com.joo.ball.service.auth;

import com.joo.ball.dto.auth.request.SignUpRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthCommandService {
    public void createUser(SignUpRequest signUpRequest) {
        /*
        * 회원 생성
        * 1. 중복된 username이 있나 체크
        * 2. 중복 발견 시 실패 반환
        * 3. 중복 아닐 시 password 암호화하고 DB에 저장
         */
    }
}
