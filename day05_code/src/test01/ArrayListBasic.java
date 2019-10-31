package test01;

import java.util.ArrayList;

/**
 * 在ArrayList中存储基本数据类型，就必须使用其包装类
 * 基本数据类型   包装类(引用类型，包装类都下java的lang包下)
 * byte         Byte
 * short        Short
 * int          Integer[特殊]
 * long         long
 * float        Float
 * double       Double
 * char         Character[特殊]
 * boolean      Boolean
 */

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //添加元素;
        arr.add(100);
        arr.add(50);
        arr.add(20);
        arr.add(10);
        //遍历每一个元素;
        System.out.println("遍历元素:");
        for (int i = 0; i < arr.size(); i++) {
            Integer result = arr.get(i);//获取每一个元素;
            //输出每一个元素;
            System.out.println("第" + i + "元素:" + result);
        }
        //比较两个数的大小;
        System.out.println("比较两个数的大小!");
        Integer number1 = Integer.max(10, 20);
        System.out.println("MAX:" + number1);

        Integer number2 = Integer.min(10, 20);
        System.out.println("MIN:" + number2);
        //转成十进制类型;
        String number3 = Integer.toString(1234);
        System.out.println("toString:" + number3);
        String number4 = Integer.toBinaryString(20);//转成二进制数;
        System.out.println("toBinaryString:" + number4);
        String number5 = Integer.toHexString(20);//转成十六进制数;
        System.out.println("toHexString:" + number5);
        String number6 = Integer.toOctalString(20);//转成8进制的数;
        System.out.println("toOctalString:" + number6);

    }
}
