package day09_code.AbstractTest02;

import java.util.ArrayList;

public class MainRedPakage {
    public static void main(String[] args) {
        //创建群主对象
        Manager manager = new Manager("群主",100);

        //创建普通用户对象
        Member A = new Member("A",0);
        Member B = new Member("B",0);
        Member C = new Member("C",0);
        Member D = new Member("D",0);
        Member E = new Member("E",0);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
        E.show();
        System.out.println("=============");
        ArrayList<Integer> send = manager.send(61, 5);//发红包
        A.receive(send);
        B.receive(send);
        C.receive(send);
        D.receive(send);
        E.receive(send);
        manager.show();
        A.show();
        B.show();
        C.show();
        D.show();
        E.show();
    }
}
