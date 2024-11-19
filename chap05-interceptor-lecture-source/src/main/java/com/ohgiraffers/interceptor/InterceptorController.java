package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorController {

    @GetMapping("stopwatch")
    public String hanlderMethod() throws InterruptedException {

        System.out.println("Controller 의 핸들러 메소드 호출됨...");

        // 2초간 아무 동작도 하지 않게 만드는 sleep 메소드
        Thread.sleep(2000);

        return "result";
    }

}
