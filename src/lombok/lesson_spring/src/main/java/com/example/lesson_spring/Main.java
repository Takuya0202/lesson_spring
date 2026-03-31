package com.example.lesson_spring;

class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("name");
        user.setAge(20);
        System.out.println(user.getName());
        System.out.println(user.getAge());

        User2 user2 = new User2("name", 20);
        System.out.println(user2.getName());
        System.out.println(user2.getAge());

        User2 user3 = new User2();
        user3.setName("name");
        user3.setAge(20);
        System.out.println(user3.getName());
        System.out.println(user3.getAge());
    }
}
