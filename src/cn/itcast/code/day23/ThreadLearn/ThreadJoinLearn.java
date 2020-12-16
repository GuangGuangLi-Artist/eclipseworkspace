package cn.itcast.code.day23.ThreadLearn;

import java.util.Date;

public class ThreadJoinLearn extends Thread{

    public ThreadJoinLearn() {
    }

    public ThreadJoinLearn(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName() + ":" + i +  ",当前时间" + new Date());
        }
    }
}
