package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// コントローラーのアノテーション
@Controller
// urlのpathとメソッドをマッピングする
// hello = /hello で最初は省略できる。
@RequestMapping("hello")
public class HelloViewController {
    // getメソッドのみ。requrestmappingのパスのみバージョン
    @GetMapping("view")
    public String view(Model model) {
        model.addAttribute("msg", "thymeleaf!!!");
        // templates/hello.html を返す。
        // return "hello";

        // templates/helloThymeleaf.html を返す。
        return "helloThymeleaf";
    }

    @GetMapping("modelAndView")
    public ModelAndView view2(ModelAndView modelAndView) {
        modelAndView.addObject("msg", "タイムリーフ");
        modelAndView.setViewName("helloThymeleaf");
        return modelAndView;
    }
}
