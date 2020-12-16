package cn.itcast.code.day23.ThreadLearn;

import java.util.Date;

public class ThreadSleepLearn extends Thread {

    public ThreadSleepLearn(String name) {
        super(name);
    }

    public ThreadSleepLearn() {
    }

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(getName() +  ":" + i + ",日期:" + new Date());

            //线程休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
