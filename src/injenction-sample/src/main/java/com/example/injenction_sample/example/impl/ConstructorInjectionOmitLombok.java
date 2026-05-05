package com.example.injenction_sample.example.impl;

import org.springframework.stereotype.Component;

import com.example.injenction_sample.example.Example;
import com.example.injenction_sample.service.someService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ConstructorInjectionOmitLombok implements Example {
    // requiredArgsConstructorを使うことでコンストラクタすら省略できる。
    // このクラスのfinalを持つフィールドは全て引数にとるコンストラクタが生成される。
    final private someService someService;

    @Override
    public void run() {
        someService.doSomething();
    }
}
