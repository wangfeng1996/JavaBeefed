package day08_code.ExtendTest;

public class test {
    public static void main(String[] args) {
        //创建子类对象
        Zi zi = new Zi();
        System.out.println("zi_num:"+zi.zi_num);
        System.out.println("==============");
        //子类调用父类的成员变量
        System.out.println("Fu_num:"+zi.Fu_num);
        //子类调用父类的成员方法;
        zi.Fu_method();
        System.out.println(zi.num);
    }
}
