package com.example.LayerDemo.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/coffee")
public class MemberController { /** Request를 받아서 Response하기 **/

    MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/create")
    String create(Model model) {
        Member member = new Member(1, "songa"); // 가짜 객체를 만들고
        Member savedMember = memberService.save(member);                      // 객체를 서비스에게 전달하면서, 너 일 해
        model.addAttribute("member",savedMember);
        return "hello"; // view 파일 이름
    }

    // https://songacoding.tistory.com/3

//    @GetMapping("/request")
    @RequestMapping(value="/request", method= RequestMethod.GET)
    String request(@RequestParam("na") String name,
                   Model model) {
        model.addAttribute("nm", name);
        return "request";
    }
}
