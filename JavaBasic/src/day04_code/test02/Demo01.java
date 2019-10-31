package day04_code.test02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33之间的随机数，并且添加到集合中，遍历集合
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建随机数对象;
        Random r = new Random();
        //创建集合对象
        ArrayList<Integer> arr = new ArrayList<>();
        //将随机数添加到集合中;
        for (int i = 0; i < 6; i++) {
            int number = 1 + r.nextInt(33);
            arr.add(number);
        }
        //遍历集合对象;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("第"+i+"元素:"+arr.get(i));
            //123
        }
    }
}
