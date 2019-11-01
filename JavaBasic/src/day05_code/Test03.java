package day05_code;

import sun.nio.cs.ext.TIS_620;

import java.util.ArrayList;
import java.util.Random;

/**
 * 随机存储20个数字到集合中
 * 定义一个方法将数据存储到方法中，并且判断是否是偶数;
 */
public class Test03 {
    public static void main(String[] args) {
        //创建集合对象;
        ArrayList<Integer> arrayList = new ArrayList<>();
        //创建随机数
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            //获取20个随机数;
            int result = random.nextInt(100) + 1;
            //将20个元素添加到元素集合中
            arrayList.add(result);
        }
        System.out.println("arrayList:" + arrayList);
        //判断集合中的元素是否是偶数;
        //然后将这些数添加到新的集合中，并且输出;
        //遍历每个元素
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer num = arrayList.get(i);
            if (num % 2 == 0) {
                arrayList1.add(num);
            }
        }
        System.out.println("arrayList1:" + arrayList1);
    }
}
