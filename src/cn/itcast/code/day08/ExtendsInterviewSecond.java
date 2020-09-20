package cn.itcast.code.day08;

public class ExtendsInterviewSecond {
    public static void main(String[] args) {

        Son3 s = new Son3();

    }
}

class Fu3{
    static {
        System.out.println("Fu静态代码块");
    }

    {
        System.out.println("Fu构造代码块");
    }

    public Fu3 (){
        System.out.println("Fu构造方法");
    }
}

class Son3 extends Fu3{
    static {
        System.out.println("Son静态代码块");
    }

    {
        System.out.println("Son构造代码块");
    }

    public Son3 (){
        System.out.println("Son构造方法");
    }
}
