package cn.itcast.code.day24.ThreadLearn.LockLearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockLearn implements Runnable {



    private int nums = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){


            try {
                lock.lock();
                if(nums>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + nums-- + "张票");
                }
            }finally {

                //释放锁
                lock.unlock();
            }



        }
    }
}
