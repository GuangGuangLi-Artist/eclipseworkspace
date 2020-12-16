package cn.itcast.code.day23.Test;

public class SellTickets implements Runnable {


    private int tickets = 100;

    //创建锁对象，定义同一把锁
    private Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(tickets > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" + (tickets--) + "张票");
                }
            }


        }
    }
}
