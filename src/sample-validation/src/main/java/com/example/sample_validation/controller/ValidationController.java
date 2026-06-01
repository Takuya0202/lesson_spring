package com.example.sample_validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sample_validation.form.CalcForm;
import com.example.sample_validation.form.GreetForm;

@Controller
public class ValidationController {
    @ModelAttribute
    public CalcForm setupCalcForm() {
        return new CalcForm();
    }

    @ModelAttribute
    public GreetForm setupGreetForm() {
        return new GreetForm();
    }

    @GetMapping
    public String showView() {
        return "entry";
    }

    // @validatedでバリデーション実行し、結果をbindingResultで受け取る
    @PostMapping("calc")
    public String confirmView(@Validated CalcForm form,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "entry";
        }
        Integer calcResult = form.getVal1() + form.getVal2();
        model.addAttribute("result", calcResult);
        return "confirm";
    }

    @GetMapping("greet")
    public String greetView() {
        return "greet";
    }

    @PostMapping("greet")
    public String greetConfirm(@Validated GreetForm form,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "greet";
        }
        model.addAttribute("message", "こんにちは、" + form.getName() + "さん！");
        return "greet";
    }
}
