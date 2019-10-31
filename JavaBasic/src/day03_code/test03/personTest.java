package day03_code.test03;

public class personTest {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.name = "z";
        ps.show();

        new Person().name = "gao";
        new Person().age = 10;
        new Person().show();
    }
}
