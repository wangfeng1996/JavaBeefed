package day07_code.Arrays;

import java.util.Arrays;

/**
 * 随机输入一串字符，将这些字符按照从小到大的顺序进行排序，并且按照倒叙的方式输出
 */
public class Test02 {
    public static void main(String[] args) {
        //随机输入一段zifu
        String arr = "ahfjdhfjmakzoqa";
        //将这些数组转变成数组
        char[] chars = arr.toCharArray();
        //按照从小到大的顺序进行排序
        Arrays.sort(chars);
        //System.out.println(Arrays.toString(chars));
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
