package cn.itcast.code.day24.ThreadLearn.DieLockDemo;

public class DieLockTest {
    public static void main(String[] args) {
        DieLockDemo dd1 = new DieLockDemo(true);
        DieLockDemo dd2 = new DieLockDemo(false);

        dd1.start();
        dd2.start();
    }
}
