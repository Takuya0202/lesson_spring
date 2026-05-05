package com.example.injenction_sample.service;

import org.springframework.stereotype.Component;

// なんらかのBean
@Component
public class someService {
    public void doSomething() {
        System.out.println("doSomething");
    }
}
