package day06_code.String;

/**
 * spilt 的参数其实是一个正则表达式；不能用"."表示，如果想用"."表示，则写成"\\.";
 */
public class Demo05 {
    public static void main(String[] args) {
        //字符串的拼接
        String str = "aa,bb,cc,d";
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=========");

    }
}
