package day07_code.StaticDemo;

public class StudentDemo {
    public static void main(String[] args) {
        Student one =  new Student("张三",20);
        one.room= "101教室";
        System.out.println("性别："+one.getName()+"\t年龄:"+one.getAge()+"\t教室:"+one.room);
        Student two =  new Student("李四",16);
        System.out.println("性别："+two.getName()+"\t年龄:"+two.getAge()+"\t教室:"+two.room);

    }
}
