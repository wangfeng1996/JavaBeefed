package com.day01.demo01;

/*
定义一个类，模拟学生的信息，主要包括两个部分（属性和行为）;
属性（是什么）
    姓名，年龄，
行为（能做什么）
    吃饭、睡觉、工作等等：
 */
public class Student {
    //成员变量
    String name;
    int age;
    //成员方法；
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
