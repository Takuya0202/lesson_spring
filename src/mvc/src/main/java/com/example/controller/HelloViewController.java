package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// コントローラーのアノテーション
@Controller
// urlのpathとメソッドをマッピングする
// hello = /hello で最初は省略できる。
@RequestMapping("hello")
public class HelloViewController {
    // getメソッドのみ。requrestmappingのパスのみバージョン
    @GetMapping("view")
    public String view() {
        // templates/hello.html を返す。
        return "hello";
    }
}
