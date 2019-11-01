package day06_code.String;

/**
 * 1、public String():创建一个控标的字符
 * 2、public String(char[] array)更具字符数组来创建
 * 3、public String(Byte[] array)根据一个字节数组来创建
 *字符串如果没有new也是字符串的对象;
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        //public String(char[] array)
        char charArray[] = {'a', 'b', 'c'};
        String str = new String(charArray);
        System.out.println(str);

        byte byteArray[] = {92,96,98};
        String str1 = new String(byteArray);
        System.out.println(str1);
        String str3 = "demo";
        String str4 ="Demo";
        System.out.println("结果是:"+str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

    }
}
