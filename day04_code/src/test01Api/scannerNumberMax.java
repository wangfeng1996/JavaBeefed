package test01Api;

import java.util.Scanner;

public class scannerNumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number3 = sc.nextInt();
        //比较三个值的大小;
        int max = number1 > number2 ? number1 : number2;
        int result = max > number3 ? max : number3;
        System.out.println("最大值：" + result);
        int max1 = 0;
        if (number1 > number2) {
            max1 = number1;
        } else {
            if (number2 > number3) {
                max1 = number1;
            } else {
                max1 = number3;
            }
            System.out.println("最大值：" + max1);
        }
    }
}