package day06_code.String;

/**
 * 定义一个方法，把数组{1，2，3}按照一定的格式拼接成一个字符串[word1#word2#word3].
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        //调用方法;
        ArrayTostring(arr);
    }
    private static void ArrayTostring(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print("word" + arr[i] + "]");
            } else {
                System.out.print("word" + arr[i] + "#");
            }
        }
    }
}



