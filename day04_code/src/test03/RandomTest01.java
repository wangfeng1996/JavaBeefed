package test03;


import java.util.Random;

/**
 * 生成随机数;
 */
public class RandomTest01 {
    public static void main(String[] args) {
        //首先先创建对象
        Random r = new Random();
        //获取随机数
        int result = r.nextInt();//这边是任意的随机数
        int number = 1 + r.nextInt(10);//Random的取值是[1,11)
        //将随机数输出
        System.out.println(result+" ");
        System.out.print(number + " ");
    }
}



