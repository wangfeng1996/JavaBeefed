package day09_code.AbstractTest02;

import java.util.ArrayList;

//群主需要做的事情
public class Manager extends User {
    public Manager() {

    }
    public Manager(String name, int money) {
        super(name, money);
    }
    //定义一个集合来存储发红包的金额
    public ArrayList<Integer> send(int totalMoney, int count){

        //创建集合对象，将金额存入到集合中;
        ArrayList<Integer> ReList = new ArrayList<>();

        //首先看下群主自己还有多少钱,看金额够不够
        int leftMoney=super.getMoney();

        //判断余额和要发的金额之间的大小
        if(totalMoney>leftMoney){
            System.out.println("Sorry,您的余额不足");
            return ReList;
        }

        //将金额平均分成count份;
        int avg = totalMoney/count;//取整数
        int mod = totalMoney%count;//取余数
        for (int i = 0; i < count-1; i++) {
            ReList.add(avg);
        }
        int last = avg+mod;
            ReList.add(last);
        //重新设置下金额的
        super.setMoney(leftMoney-totalMoney);

        return ReList;
    }
}
