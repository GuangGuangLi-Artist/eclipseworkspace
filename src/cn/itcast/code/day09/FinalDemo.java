package cn.itcast.code.day09;

/*
Error:(15, 18) java: 无法从最终cn.itcast.code.day09.fu进行继承
 */

public class FinalDemo {
    public static void main(String[] args) {
        zi z = new zi();
        z.show();
    }
}


//final class fu
class fu{

    /*
    Error:(28, 17) java: cn.itcast.code.day09.zi中的show()无法覆盖cn.itcast.code.day09.fu中的show()
  被覆盖的方法为final
     */

    public  int num = 10;
    //public   final int num2 = 10;
    public    int num2 =10;

    //public final show()
    public  void show(){

        System.out.println("这是绝密资源，不能被访问");


    }

}

class zi extends fu{


    public void show() {

        num = 100;
        /*
        Error:(42, 9) java: 无法为最终变量num2分配值
         */
        num2 = 200;
        System.out.println("这是一堆垃圾");
        System.out.println(num);
        System.out.println("-----");
        System.out.println(num2);
    }
}