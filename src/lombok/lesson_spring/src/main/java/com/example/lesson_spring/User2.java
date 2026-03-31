package com.example.lesson_spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// 全てのフィールドを引数にとるコンストラクタを生成する。
@AllArgsConstructor
@NoArgsConstructor
class User2 {
    private String name;
    private int age;
}
