package cn.itcast.code.day09;

public class FinalInitializationTiming {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);
        System.out.println(d.num2);
    }

}

class Demo{
    //int num = 10;

    //final int num2 = 20;

    int num;
    final int num2;

    {
        //num2 = 10;
    }

    public Demo(){
        num = 100;
        //Error:(19, 9) java: 无法为最终变量num2分配值
        //num2 = 200;

        System.out.println("-------");
        //num2 = 200;
        num2 = 200;
    }
}
