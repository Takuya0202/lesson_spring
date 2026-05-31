package com.example.path_valiable_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathValiableController {
    @GetMapping("show")
    public String showView() {
        return "show";
    }

    // 動的param
    @GetMapping("function/{id}")
    public String selectFunction(@PathVariable Integer id) {
        String view = null;
        switch (id) {
            case 1:
                view = "pathvaliable/function1";
                break;
            case 2:
                view = "pathvaliable/function2";
                break;
            case 3:
                view = "pathvaliable/function3";
                break;
        }
        return view;
    }
}
