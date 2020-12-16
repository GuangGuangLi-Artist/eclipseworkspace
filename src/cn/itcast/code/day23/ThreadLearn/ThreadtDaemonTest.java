package cn.itcast.code.day23.ThreadLearn;

import java.util.Date;

public class ThreadtDaemonTest {
    public static void main(String[] args) {

        ThreadtDaemonLearn t1 = new ThreadtDaemonLearn("关羽");
        ThreadtDaemonLearn t2 = new ThreadtDaemonLearn("张飞");

        //设置后台线程
        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();


        //主线程
        Thread.currentThread().setName("刘备");
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName() + i +  ",当前时间" + new Date());
        }
    }
}
