package com.joo.ball.service.user;

import com.joo.ball.dto.user.request.UpdateClicksRequest;
import org.springframework.stereotype.Service;

@Service
public class UserCommandService {
    public void updateClicks(UpdateClicksRequest updateClicksRequest) {
        /*
        * 클릭 수 갱신
        * 1. total clicks를 증가
        * 2. current clicks를 증감
         */
    }
}
