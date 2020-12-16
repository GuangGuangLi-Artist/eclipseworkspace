package cn.itcast.code.day23.ThreadLearn;

public class RunnableLearn implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
