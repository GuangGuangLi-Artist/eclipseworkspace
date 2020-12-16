package cn.itcast.code.day23.ThreadLearn;

public class ThreadJoinTest {
    public static void main(String[] args) {

        ThreadJoinLearn t1 = new ThreadJoinLearn("李渊");
        ThreadJoinLearn t2 = new ThreadJoinLearn("李世民");
        ThreadJoinLearn t3 = new ThreadJoinLearn("李元霸");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();


    }
}
