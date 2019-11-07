package day06_code.StringTest;

public class Test01 {
    public static void main(String[] args) {
        //定义一个int类型的数组，并且将数组里面的类型输出;
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ",");
            }
        }
        //定义一个字符类型的数组，将数组内的类容输出
        System.out.println();
        char[] arr1 ={'a','b','v'};
        for (int i = 0; i < arr1.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr1[i]);
            }
            else {
                System.out.print(arr1[i] + ",");
            }
        }
    }
}
