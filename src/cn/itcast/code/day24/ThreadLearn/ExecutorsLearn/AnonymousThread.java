package cn.itcast.code.day24.ThreadLearn.ExecutorsLearn;
/*
匿名内部类的格式：
 		new 类名或者接口名() {
 			重写方法;
 		};
 		本质：是该类或者接口的子类对象。
 */

public class AnonymousThread {
    public static void main(String[] args) {

        //方式1
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                }

            }
        }.start();

        //方式2，实现runnable

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                }
            }
        }){}.start();


        //方式3

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello" + "--" + i);
                }
            }
        }){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("world" + "--" + i);
                }
            }
        }.start();
    }
}
