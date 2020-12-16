package cn.itcast.code.day23.ThreadLearn;

public class ThreadSleepTest {

    public static void main(String[] args) {
        //创建线程
        ThreadSleepLearn t1 = new ThreadSleepLearn("苏彪");
        ThreadSleepLearn t2 = new ThreadSleepLearn("陈诚");
        ThreadSleepLearn t3 = new ThreadSleepLearn("李广");

        t1.start();
        t2.start();
        t3.start();
    }
}
