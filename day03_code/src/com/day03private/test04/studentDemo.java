package com.day03private.test04;

public class studentDemo {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setAge(10);
        st1.setName("张三");
        System.out.println("年龄："+st1.getAge()+"\t姓名:"+st1.getName());
        System.out.println("===============");
        Student st2 = new Student("李四",12);
        System.out.println("年龄："+st2.getAge()+"\t姓名:"+st2.getName());

    }
}
