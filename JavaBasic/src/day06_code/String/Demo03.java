package day06_code.String;

/**
 * 字符串的截取方法
 * public String substring(int index);//截取从参数位置到末尾
 * public String substring(int begin,int end);//截取从begin开始到end结束这边的区间是[begin,end)
 */
public class Demo03 {
    public static void main(String[] args) {
        String str = "abcdefg";
        //截取某个位置到末尾的位置
        String result = str.substring(2);
        System.out.println(result);
         //截取某个位置到末尾的位置，及某个区间的位置
        String result1 = str.substring(2,5);
        System.out.println(result1);

    }
}
