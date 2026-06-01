package com.example.sample_validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample_validation.form.CalcForm;
import com.example.sample_validation.form.GreetForm;

@Controller
@RequestMapping("bad")
public class ValidationControllerBad {

    @GetMapping
    public String showView(Model model) {
        model.addAttribute("calcForm", new CalcForm());
        model.addAttribute("greetForm", new GreetForm());
        return "entry-bad";
    }

    @PostMapping("calc")
    public String confirmView(@Validated @ModelAttribute CalcForm calcForm,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("greetForm", new GreetForm());
            return "entry-bad";
        }
        Integer calcResult = calcForm.getVal1() + calcForm.getVal2();
        model.addAttribute("result", calcResult);
        return "confirm";
    }

    @GetMapping("greet")
    public String greetView(Model model) {
        model.addAttribute("calcForm", new CalcForm());
        model.addAttribute("greetForm", new GreetForm());
        return "greet-bad";
    }

    @PostMapping("greet")
    public String greetConfirm(@Validated @ModelAttribute GreetForm greetForm,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("calcForm", new CalcForm());
            return "greet-bad";
        }
        model.addAttribute("message", "こんにちは、" + greetForm.getName() + "さん！");
        return "greet-bad";
    }
}
