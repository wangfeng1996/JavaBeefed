package day03_code.test02;
import java.util.Scanner;

/**
 * 题目要求：
 * 键盘输入连个数字，将这俩个数字加起来，并且输出结果.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        System.out.println("总和："+(number1+number2));

    }
}
