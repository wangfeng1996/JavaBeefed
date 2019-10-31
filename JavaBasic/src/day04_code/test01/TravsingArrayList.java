package day04_code.test01;

import java.util.ArrayList;

/**
 * 遍历集合
 */
public class TravsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        //添加集合对象;
        arr.add("张三");
        arr.add("李四");
        arr.add("王五");
        //遍历集合对象;
        for (int i = 0; i < arr.size(); i++) {
            String result = arr.get(i);//读取元素
            System.out.println(result);
        }
    }
}
