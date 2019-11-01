package day06_code.String;

/**
 * 字符串的转换;
 * 1、public char[] toCharArray()；将字符串转成字符数组
 *2、public byte[] getBytes();获得当前字符串的底层的字节数组
 * 3、public String replace(oldString,newString);字符串内容的替换，将字符串中某个元素换成你指定的元素;
 */
public class Demo04 {
    public static void main(String[] args) {
        String str = "abc";
        char[] array = str.toCharArray();
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        byte[] array1 = str.getBytes();
        for (int i = 0; i <array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        String Str2 = "hello World";
        //字符串内容的替换，将字符串中某个元素换成你指定的元素;
        String result3 = Str2.replace("o","F");
        System.out.println(Str2);
        System.out.println(result3);
    }
}
