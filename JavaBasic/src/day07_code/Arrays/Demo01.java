package day07_code.Arrays;

import java.util.Arrays;

/**
 * 数组的工具类：
 * java.util.Arrays是一个与数组相关的工具类，里面提供大量的静态方法 ，用于实现数组的一些常用的操作
 * 1、public static String toString(数组)，将参数数组转变成字符串（按照默认格式,数组里面的默认顺序）
 * 2、public static String sort(数组)按照从小到大的格式进行排序
 * 注意事项：
 * sort数字按照从小到大，字母按照字母的顺序排序
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //将数组的默认格式转变为字符串
        String string = Arrays.toString(arr);
        System.out.println(string);
        int[] arr1 = {52, 8, 32, 56, 4};
        Arrays.sort(arr1);//按照从小到大的格式进行排序
        System.out.println(Arrays.toString(arr1));
        String[] arr2 = {"aaa","da","bbcc"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
