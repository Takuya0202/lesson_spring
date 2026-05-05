package com.example.injenction_sample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.injenction_sample.example.Example;
import com.example.injenction_sample.service.someService;

// @Component
public class SetterInjection implements Example {
    // セッターインジェクション。setterメソッドで注入する方式
    private someService someService;

    @Autowired
    public void setSomeService(someService someService) {
        this.someService = someService;
    }

    @Override
    public void run() {
        someService.doSomething();
    }
}
