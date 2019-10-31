package test03;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 键盘输入的数字和随机产生的数字进行比较，但是这个随机数是保持不变的。
 *
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random r = new Random();
        int result = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜的数字");
            int number = sc.nextInt();
            if (number > result) {
                System.out.println("太大了");
            }
            if (number < result) {
                System.out.println("太小了");
            }
            if (result == number) {
                System.out.print("猜对了");
                break;
            }
        }
    }
}
