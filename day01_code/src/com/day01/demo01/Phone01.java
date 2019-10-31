package com.day01.demo01;
//方法的调用;
//静态方法可以直接在main函数中直接调用
public class Phone01 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.color = "土豪金";
        p.plate = "Apple";
        p.price = 8388;
        method(p);
    }

    public static void method(Phone param) {
        System.out.println(param.plate);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
