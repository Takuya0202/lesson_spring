package com.example.injenction_sample.example.impl;

import com.example.injenction_sample.example.Example;
import com.example.injenction_sample.service.someService;

public class ConstructorInjection implements Example {
    // コンストラクタインジェクション。コンストラクタで注入する方式
    final private someService someService;

    // spring4.3以降、コンストラクタが1つの場合は@Autowiredを省略できる。
    // @Autowired
    public ConstructorInjection(someService someService) {
        this.someService = someService;
    }

    @Override
    public void run() {
        someService.doSomething();
    }
}
