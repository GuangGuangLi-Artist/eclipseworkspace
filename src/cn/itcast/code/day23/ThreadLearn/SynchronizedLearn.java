package cn.itcast.code.day23.ThreadLearn;

public class SynchronizedLearn implements Runnable {

    private int num = 100;

    Demo d = new Demo();

    private  int x= 0;


    @Override
    public void run() {
        while (true){
            if(x%2==0){
                synchronized (this){
                    if(num>0){
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在卖出第" + (num--) + "张票");
                    }

                }
            }
            else {
                sellTicket();
            }
            x++;
        }

    }

    private synchronized void sellTicket() {
            if(num>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + (num--) + "张票");
            }

    }
}


class Demo{

}
