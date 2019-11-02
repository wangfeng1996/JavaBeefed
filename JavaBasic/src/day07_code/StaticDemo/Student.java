package day07_code.StaticDemo;

/**
 * 静态：static
 *
 * 比如说，张三、李四、、王五都是一个班级的，那么
 * static 不属于自己，而是属于类
 *1、static修饰成员变量
 *
 *
 */
public class Student {
    private String name;
    private int age;
    static String room;
    //无参构造
    public Student(){

    }
    public Student(String name,int age){
        this.age= age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
