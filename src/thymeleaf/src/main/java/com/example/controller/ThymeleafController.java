package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;

@Controller
public class ThymeleafController {
    @GetMapping("main")
    public String view(Model model) {
        Member member = new Member(1, "name");

        Member member1 = new Member(10, "太郎");
        Member member2 = new Member(20, "花子");

        List<String> list = new ArrayList<>();

        list.add("east");
        list.add("west");
        list.add("south");
        list.add("north");

        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("member1", member1);
        memberMap.put("member2", member2);

        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);

        model.addAttribute("member", member);
        model.addAttribute("mb", member);
        model.addAttribute("list", list);
        model.addAttribute("memberMap", memberMap);
        model.addAttribute("memberList", memberList);

        return "main";
    }

}
