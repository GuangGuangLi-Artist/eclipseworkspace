package cn.itcast.code.day08;
/*
林青霞都60了
我是main方法
这是静态代码块
这是构造代码块
这是构造方法
这是构造代码块
这是构造方法
 */

public class ExecuteOrder {
    static {
        System.out.println("林青霞都60了");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");

        Execu ec = new Execu();
        Execu ec1 = new Execu();
    }
}

class Execu{
    static {
        System.out.println("这是静态代码块");
    }

    {
        System.out.println("这是构造代码块");
    }

    public Execu(){
        System.out.println("这是构造方法");
    }
}
