package com.joo.ball.service.user;

import com.joo.ball.dto.user.request.WithdrawAccountRequest;
import org.springframework.stereotype.Service;

@Service
public class AccountCommandService {
    public void withdrawAccount(WithdrawAccountRequest withdrawRequest, String token) {
        /*
        * 회원 탈퇴
        * 1. DTO에 들어온 password를 암호화하여 DB에 저장된 것과 비교
        * 2. 회원 탈퇴 시 users_table에서 즉각 삭제 (Blacklist table 사용 X)
         */
    }
}
