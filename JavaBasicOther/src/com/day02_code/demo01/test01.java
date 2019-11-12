package com.day02_code.demo01;

/*
    学习集合的目标：
    1、会使用集合存储对象
    2、会遍历集合，将数据取出来
    3、掌握每个集合的特性
        list集合：1、有序的集合
                 2、允许存储重复的元素
                 3、有索引，可以使用普通的循环进行遍历集合
        set集合：  1、不允许存储重复元素
                  2、没有索引（不能使用普通的for循环进行遍历）
                  3、


 */


import java.util.ArrayList;
import java.util.Collection;

public class test01 {
    public static void main(String[] args) {
        //创建集合对象：
        Collection<String> collection = new ArrayList();
        //1、public boolean add(E,e);在集合中添加对象
        collection.add("Hello");
        collection.add("java");
        collection.add("C++");
        collection.add("python");
        collection.add("javaScrip");
        collection.add("C");
        System.out.println(collection);
        System.out.println("==============");

        //2、public boolean remove(E e)把给定的集合对象在集合中删除
        System.out.println(collection.remove("Hello"));

        System.out.println("==============");
        //3、public boolean contains(E,e)  判断集合中是否存在指定集合对象;
        //包含返回true，不包含返回false
        System.out.println(collection.contains("java"));
        System.out.println("=============");
        //4、public Boolean isEmpty()---判断集合是否为空
        //集合为空返回：true   集合不为空则返回：false
        System.out.println(collection.isEmpty());
        System.out.println("=============");
        //5、public Boolean size（）返回集合中的元素个数：
        System.out.println(collection.size());
        System.out.println("=============");
        //6、public object[] toArray()---将集合对象转变为数组形式，将集合中的元素存储到数组中;
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("=============");
        //7、public void clear();清空集合中所有的元素;
        // 但是集合还在，知识集合中没有元素而已
        collection.clear();
        System.out.println(collection);
    }
}
