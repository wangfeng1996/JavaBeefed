package day07_code.Arrays;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        //将随机字符中的字符按照升序的顺序进行排序；
        String arr = "hjhfjsdfhfsj";
        //将字符转化成字符数组
        char[] chars = arr.toCharArray();
        //将字符数组进行升序排序
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]+"");
        }

    }
}

