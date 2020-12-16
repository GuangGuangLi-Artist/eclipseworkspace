package cn.itcast.code.day23.ThreadLearn;

public class ThreadYieldTest {

    public static void main(String[] args) {
        ThreadYieldLearn t1 = new ThreadYieldLearn("林青霞");
        ThreadYieldLearn t2 = new ThreadYieldLearn("刘意");

        t1.start();
        t2.start();
    }
}
