package com.example.LayerDemo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    void save(Member member) {
        memberRepository.save(member);
    }
}
