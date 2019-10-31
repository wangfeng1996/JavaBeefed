package day04_code.test01;

import java.util.ArrayList;

/**
 * 如果定义数组的话，数组的长度是固定的，不可发生改变
 * 但是ArrayList来说，集合的长度是可以发生随便变化的
 * 对于Arraylist来说，由一个尖括号<>用来表示泛型
 * 泛型：通俗点说，就是集合是什么样类型的集合
 * 注意:泛型只能是引用数据类型，不能是基本数据类型;
 */
public class arrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        //集合的方法：
        //1、public boolean add(E e);向集合添加元素，参数的类型和泛型一样，返回值表示添加是否成功;
        boolean result = arr.add("张三");//返回值表示是否添加成功;
        arr.add("李四");
        arr.add("赵六");
        System.out.println(result);
        //2、从集合中获取元素，索引值从0开始
        System.out.println(arr.get(1));
        //3、从集合中删除文件
        arr.remove(2);
        System.out.println(arr);
        //4、获取集合的长度;
        int size =arr.size();
        System.out.println(size);
    }
}
