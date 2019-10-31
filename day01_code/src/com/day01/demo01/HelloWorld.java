package com.day01.demo01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        Scanner sc = new Scanner(System.in);
        //sc类的运用;
        System.out.println("请输入第一个数字！");
        int s1 = sc.nextInt();
        System.out.println("请输入第二个数字！");
        int s2 = sc.nextInt();

        System.out.println("最终答案是："+(s1+s2));
    }
}
