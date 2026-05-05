package com.example.injenction_sample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.injenction_sample.example.Example;
import com.example.injenction_sample.service.someService;

// @component
public class FieldInjection implements Example {
    // フィールドインジェクション。autowiredで注入する方式
    @Autowired
    private someService someService;

    @Override
    public void run() {
        someService.doSomething();
    }
}
