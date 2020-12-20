package cn.itcast.code.day24.ThreadLearn.ThreadGroupLearn;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        threadGroupMethod();
    }

    private static void threadGroupMethod() {

        //创建线程组
        ThreadGroup tg = new ThreadGroup("这是一个新的线程组");
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(tg,mr,"苏彪");
        Thread t2 = new Thread(tg,mr,"李广");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());

        //t1.start();
        //t2.start();
    }

}
