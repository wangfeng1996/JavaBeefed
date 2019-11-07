package day09_code.AbstractTest02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        //在多个红包中抽取一个红包给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());//随机抽取第几个红包从0开始
        //根据索引将已经抢到的红包删除
        int delta = list.remove(index);
        //获取自己当前的金额
        int money = super.getMoney();
        //将当前的金额和自己抢到的金额重新设置下
        super.setMoney(money+delta);
    }

}
