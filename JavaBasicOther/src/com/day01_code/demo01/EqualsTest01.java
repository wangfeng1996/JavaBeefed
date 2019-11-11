package com.day01_code.demo01;

public class EqualsTest01 {
    /**
     * @param args equals默认访问的是地址值
     *             1、基本数据类型比较的是值的大小相不相同
     *             2、引用数据类型，比较的是两个对象的地址值是否相同(没有意义)
     *             这边表示的是比较对象是否相等
     *             多态;父类引用指向子类对象
     *
     *
     */

    public static void main(String[] args) {
        EqualsTest02 test02 = new EqualsTest02("张三", 20);

        EqualsTest02 test021 = new EqualsTest02("张三", 20);

        System.out.println(test02.equals(test021));//false


    }
}
