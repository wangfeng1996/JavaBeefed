package day02_code.test02;

public class Student {
    //定义一个学生类
    private String name;
    private int age;

    //设置值的前提必须知道这个值之前的值是多少
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println("学生："+name+"\t年龄："+age);
    }

}
