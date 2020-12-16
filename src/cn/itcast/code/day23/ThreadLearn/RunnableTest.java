package cn.itcast.code.day23.ThreadLearn;
/*
            A:自定义类MyRunnable实现Runnable接口
    		B:重写run()方法
    		C:创建MyRunnable类的对象
    		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */

public class RunnableTest {

    public static void main(String[] args) {

        //创建RunnableLearn的对象
        RunnableLearn r1 = new RunnableLearn();


        //创建Thread类的对象，并把C步骤的对象作为构造参数传递
        Thread t1 = new Thread(r1,"苏彪");
        Thread t2 = new Thread(r1,"陈诚");

        t1.start();
        t2.start();



    }
}
