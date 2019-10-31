package day02_code.test03this;

/**
 * 注意事项：
 * 1、构造方法必和类的名称完全一样，大小写也要是一样的;
 * 2、构造方法不需要返回值
 * 3、构造方法不能return一个具体的返回值
 * 4、如果没有编写任何的构造方法，那么编译器会直接赠送一个无参的构造方法
 * 5、如果编写了至少一个构造方法，编译器将不会再赠送
 */
public class thisDemo01 {
    //无参构造
    public thisDemo01(){

    }






    //this主要是区分变量之间重名的情况
    static String name = "张三";

//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        thisDemo01.name = name;
//    }

    public static void main(String[] args) {
        String name = "李四";
        System.out.println(name + "" + thisDemo01.name);
    }

}
