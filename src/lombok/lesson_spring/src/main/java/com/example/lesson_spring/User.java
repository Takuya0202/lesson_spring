package com.example.lesson_spring;

import lombok.Getter;
import lombok.Setter;

// setterとgetterが自動で生成されるようになる。
@Setter
@Getter
public class User {
    private String name;
    private int age;
}
