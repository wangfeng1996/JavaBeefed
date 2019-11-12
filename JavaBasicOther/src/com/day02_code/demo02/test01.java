package com.day02_code.demo02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 介绍iterator接口----迭代器
 */
public class test01 {
    public static void main(String[] args) {
        Collection<String> iter = new ArrayList();
        //在集合中添加对象
        iter.add("hello");
        iter.add("world");
        iter.add("java");
        iter.add("C++");
        iter.add("python");

    }

}
