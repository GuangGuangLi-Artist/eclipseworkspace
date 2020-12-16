package cn.itcast.code.day23.ThreadLearn;

import java.util.Date;

public class ThreadtDaemonLearn extends Thread {

    public ThreadtDaemonLearn() {
    }

    public ThreadtDaemonLearn(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName() + ":" + i +  ",当前时间" + new Date());
        }
    }
}
