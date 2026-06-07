package com.example.correlation_validation_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.correlation_validation_sample.form.SampleForm;

@Controller
public class CheckController {
    @GetMapping()
    public String showForm(SampleForm f) {
        return "entry";
    }

    @PostMapping
    public String check(@Validated SampleForm f, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "entry";
        }
        return "result";
    }
}
