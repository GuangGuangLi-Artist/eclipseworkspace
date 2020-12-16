package cn.itcast.code.day23.ThreadLearn;

public class ThreadStopTest {
    public static void main(String[] args) {
        ThreadStopLearn t1 = new ThreadStopLearn();

        t1.setName("苏彪");
        t1.start();

        try {
            Thread.sleep(3000);
            //t1.stop();
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
