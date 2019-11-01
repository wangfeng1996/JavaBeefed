package day06_code.String;

import java.util.Scanner;

/**
 * 键盘输入一个字符串，统计各种字符出现的个数
 * 大写，小写 数字 其他;
 */
public class Demo07 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //str.
        char[] chars = str.toCharArray();
        int m=0;
        int n=0;
        int j=0;
        int k=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]>='A'&&chars[i]<='Z'){
                m++;
            }
            else if(chars[i]>='a'&&chars[i]<='z'){
                n++;
            }
            else if(chars[i]>='0'&&chars[i]<='9'){
                j++;
            }else{
                k++;
            }
        }
        System.out.println("大写:"+m);
        System.out.println("小写:"+n);
        System.out.println("数字:"+j);
        System.out.println("其他:"+k);
    }
}
