package cn.itcast.code.day24.ThreadLearn.DieLockDemo;

public class DieLockDemo  extends Thread{

    private boolean flag;
    public DieLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.obj1){
                System.out.println("if obj1");
                synchronized (MyLock.obj2){
                    System.out.println("if obj2");
                }
            }
        }else {
            synchronized (MyLock.obj2){
                System.out.println("else obj2");
                synchronized (MyLock.obj1){
                    System.out.println("else ob12");
                }
            }
        }

    }
}
