package com.example.LayerDemo.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {

    MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/create")
    String create() {
        Member member = new Member(1, "songa"); // 가짜 객체를 만들고
        memberService.save(member);                      // 객체를 서비스에게 전달하면서, 너 일 해

        return "hello";
    }
}
