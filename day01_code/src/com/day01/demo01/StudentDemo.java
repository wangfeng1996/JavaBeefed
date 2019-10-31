package com.day01.demo01;
/*
导包格式：import 包名称.类名称;
如果文件在同一个包中可以不需要导包，在不同的
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.sleep();
        s.study();
        System.out.println("年龄:"+(s.age=10));
        System.out.print("姓名:"+(s.name="张三"));
    }
}
