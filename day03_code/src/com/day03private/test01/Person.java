package com.day03private.test01;

public class Person {
    //创建成员变量
    private String name;//姓名
    private int age;//年龄


    //创建成员方法
    public void show() {
        System.out.println("我叫"+name+";年龄"+age);
    }

    public void setAge(int age) {
        this.age = age;
        if(this.age<=0||this.age>=100){
            System.out.println("年龄不符合要求");
        }
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
