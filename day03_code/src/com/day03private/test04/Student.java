package com.day03private.test04;

public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造
    public Student() {
        System.out.println("无参构造执行啦！！");
    }

    public Student(String name, int age) {
        System.out.println("全参数构造执行啦！！");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
