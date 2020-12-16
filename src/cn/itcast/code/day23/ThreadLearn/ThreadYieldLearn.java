package cn.itcast.code.day23.ThreadLearn;

import java.util.Date;

public class ThreadYieldLearn extends Thread {

    public ThreadYieldLearn() {
    }

    public ThreadYieldLearn(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName() + ":" + i +  ",当前时间" + new Date());
            Thread.yield();
        }
    }
}
