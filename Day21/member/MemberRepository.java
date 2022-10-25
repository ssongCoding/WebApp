package com.example.LayerDemo.member;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {
    Map<Integer, Member> db = new HashMap<>();

    void save(Member member) {
        db.put(member.getmID(), member);
        System.out.println("DB에 " + member.getName() + "객체가 저장되었습니다.");
    }
}
