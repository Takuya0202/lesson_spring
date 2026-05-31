package com.example.requestparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.requestparam.form.SampleForm;

@Controller
public class RequestParamMultipleController {
    @GetMapping("multiple")
    public String showView() {
        return "entry";
    }

    // @PostMapping("confirm")
    // public String confirmView(
    // @RequestParam String name,
    // @RequestParam Integer age,
    // @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth,
    // Model model) {
    // model.addAttribute("name", name);
    // model.addAttribute("age", age);
    // model.addAttribute("birth", birth);
    // return "confirm";
    // }

    @PostMapping("confirm")
    public String confirmView(SampleForm f) {
        // TODO: process POST request

        return "confirm2";
    }

}
