package day06_code.String;

/**
 * String中获取字符串的常用方法：
 * public int length():获取字符串的长度
 * public String concat(String str):将当前的字符串和传进来的字符串进行拼接;
 * public String CharAt(int index):获取指定索引位置的字符
 * public String indexOf(String str);查找字符串在本字符串中首次出现的位置
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("获取字符串的长度;");
       //获取字符串的长度;
        String str = "abcd";
        System.out.println("字符串的长度："+str.length());
        System.out.println("字符串的拼接");
        //字符串的拼接，和"+"是同一个功能；
        String str2 = str.concat("cd");
        System.out.println(str2);
        System.out.println("获取指定索引位置的单个字符");
        //获取指定索引位置的单个字符(从索引 0 开始)
        String st3 = "adjfhdjhfja";
        System.out.println(st3.charAt(3));
        System.out.println("查找字符串在本字符串中首次出现的位置");
        String st4 = "adjfhdjhfja";
        //如果查找成功，则返回索引值，如果是没有查找的内容，则返回-1；
        System.out.println(st4.indexOf("jhk"));
    }
}
