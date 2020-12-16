package cn.itcast.code.day23.ThreadLearn;

public class SynchronizedTest {

    public static void main(String[] args) {
        SynchronizedLearn sl = new SynchronizedLearn();

        Thread t1 = new Thread(sl,"窗口1");
        Thread t2 = new Thread(sl,"窗口2");
        Thread t3 = new Thread(sl,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
