package day05_code;

import java.util.ArrayList;

/**
 * 以指定的格式打印集合例如：{10@20@30}
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //添加元素
        arr.add("山东");
        arr.add("广东");
        arr.add("江苏");
        System.out.print("{");
        //遍历集合对象;
        PrintArrayList(arr);//调用方法;
    }

    private static void PrintArrayList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            String result = arr.get(i);
            //判断元素是否是最后一个元素，如果是的则"}"
            if (i == arr.size() - 1) {
                System.out.print(result + "}");
            } else {
                System.out.print(result + "@");
            }
        }
    }
}
