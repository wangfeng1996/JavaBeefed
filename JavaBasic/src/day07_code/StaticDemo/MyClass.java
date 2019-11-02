package day07_code.StaticDemo;

/**
 * 静态方法可以直接调用不需要创建对象;
 * 静态可以直接访问静态，不能访问非静态（内存中是先有静态，后有非静态）
 * 但是非静态可以直接访问静态
 * 静态方法中不能使用this关键字
 *
 *创建对象时，首先时进栈，然后在堆里面找你想要的东西
 * 静态代码块
 * 当第一次用到本类的时候，静态代码块执行唯一一次
 * 静态内容总是优先于非静态，所以静态代码块比构造方法先执行
 *
 * 典型的用途
 * 用来一次性对静态的成员变量进行赋值
 *
 */
public class MyClass {
    public static void main(String[] args) {
        method02();

    }
    public  static void method02(){
        System.out.println("这是一个静态的成员方法");
    }
}
