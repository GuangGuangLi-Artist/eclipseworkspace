package cn.itcast.code.day23.ThreadLearn;
/*
    该类要重写run()方法,为什么呢?
    不是类中的所有代码都需要被线程执行的。
    而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。

    如何获取线程对象的名称呢?
    public final String getName():获取线程的名称。
    如何设置线程对象的名称呢?
    public final void setName(String name):设置线程的名称

    针对不是Thread类的子类中如何获取线程对象名称呢?
    public static Thread currentThread():返回当前正在执行的线程对象

    我们的线程没有设置优先级,肯定有默认优先级。
    那么，默认优先级是多少呢?
    如何获取线程对象的优先级?
            public final int getPriority():返回线程对象的优先级
    如何设置线程对象的优先级呢?
            public final void setPriority(int newPriority)：更改线程的优先级。

    注意：
            线程默认优先级是5。
            线程优先级的范围是：1-10。
            线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。

    IllegalArgumentException:非法参数异常。
    抛出的异常表明向方法传递了一个不合法或不正确的参数。
 */

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //super.run();
        //System.out.println("hello world java");
        for (int i = 0; i <200 ; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
