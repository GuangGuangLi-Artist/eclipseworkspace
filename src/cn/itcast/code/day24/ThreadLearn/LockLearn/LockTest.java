package cn.itcast.code.day24.ThreadLearn.LockLearn;

public class LockTest {

    public static void main(String[] args) {
        LockLearn ll = new LockLearn();

        Thread t1 = new Thread(ll,"窗口1");
        Thread t2 = new Thread(ll,"窗口2");

        t1.start();
        t2.start();



    }
}
