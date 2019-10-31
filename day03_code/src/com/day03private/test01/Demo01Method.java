package com.day03private.test01;

/**
 * 本章节主要讲的是面向对象的一些特征（三大特征）
 * 1、封装
 * 2、继承
 * 3、多态
 * 封装在java中的表现
 * 1、方法的封装
 */
public class Demo01Method {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 92, 50};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
