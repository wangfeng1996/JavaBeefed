package com.day01_code.demo02;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //获取当前系统时间到1970年1月1日00.00.00总共的时间累计毫秒
        System.out.println(System.currentTimeMillis());
        System.out.println("================");
        demo01();
        System.out.println("================");
        demo02();
        System.out.println("================");
        demo03();
        System.out.println("=================");
        demo04();
        System.out.println("=================");
        demo05();
        System.out.println("=================");

    }

    private static void demo05() throws ParseException {
        System.out.println("demo05");
        //解析方法：将文本解析成为date日期


        //1、创建SimpleDateFormat对象，在构造方法中传递指定模式的参数
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(format.parse("2019年11月11日 20时40分39秒"));


    }

    private static void demo04() {
        //格式化;
        //将时间按照指定的格式转化
        System.out.println("demo04");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(format.format(date));
    }

    private static void demo03() {
        System.out.println("demo03");
        //相当于：System.currentTimeMillis()
        //把日期转变为毫秒值
        Date date  = new Date();
        System.out.println(date.getTime());//返回的是系统时间到1970年1月1日0.0.0的时间差
    }

    private static void demo02() {
        System.out.println("demo02");
        //把毫秒转变为当前的日期（里面的参数是long类型的）
        Date date = new Date(0L);
        System.out.println(date);
    }

    private static void demo01() {

        System.out.println("demo01");
        Date date = new Date();
        System.out.println(date);
    }

}
