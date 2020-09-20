package cn.itcast.code.day09;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Fu6 f = new Zi6();
        f.show();

        System.out.println("-----");

        System.out.println(f.num);
        System.out.println("-----");



        /*
        Error:(9, 29) java: 找不到符号
        符号:   变量 num2
        位置: 类型为cn.itcast.code.day09.Fu6的变量 f
         */
        //System.out.println(f.num2);

        /*
        Error:(21, 10) java: 找不到符号
          符号:   方法 method()
          位置: 类型为cn.itcast.code.day09.Fu6的变量 f
         */
        //f.method();
        f.show();
        System.out.println("-----");
        f.function();
    }

}




class Fu6{

    //成员变量   编译看左边，访问看左边
    public int num = 100;



    public void show(){
        System.out.println("show Fu");
    }

    public static void function(){
        System.out.println("fu function");
    }

}

class Zi6 extends Fu6{

    public int num = 1000;
    public int num2 = 200;

    public void show() {
        System.out.println("show Zi");
    }



    //成员方法  编译看左边，运行看右边
    public void method(){
        System.out.println("method zi");
    }

    //静态方法  编译看左边，访问看左边
    public static void function(){
        System.out.println("Zi function");
    }
}