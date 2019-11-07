package day07_code.Maths;

public class Demo01 {
    public static void main(String[] args) {
        //获取绝对值
        int a = -10;
        int abs = Math.abs(a);
        System.out.println("绝对值："+abs);
        double b = 5.1;
        System.out.println("向上取整："+Math.ceil(b));
        System.out.println("向下取整："+Math.floor(b));
        double c = 53.2;
        System.out.println("四舍五入："+Math.round(c));
    }
}
