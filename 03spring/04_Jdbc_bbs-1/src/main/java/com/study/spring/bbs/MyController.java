package com.study.spring.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/hello")
    public String hello(Model model) {
        // Model에 데이터 저장
        model.addAttribute("message", "안녕하세요 JSP!");
        model.addAttribute("user", "홍길동");

        // hello.jsp 로 이동
        return "hello";
    }
}

