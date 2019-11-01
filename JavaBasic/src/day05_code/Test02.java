package day05_code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;

/**
 * 题目要求：
 * 用一个大集合存入20个随机数，然后删选其中的偶元素，放入小集合中；
 */
public class Test02 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            //获取随机集合对象;
            int result = 1 + random.nextInt(100);
            //将随机数添加到集合之中;
            arr.add(result);
        }
        ArrayList<Integer> smallList = getSmallList(arr);
        System.out.println(smallList);
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> arr) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer num = arr.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}

