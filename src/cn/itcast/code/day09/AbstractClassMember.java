package cn.itcast.code.day09;

public class AbstractClassMember {
    public static void main(String[] args) {
        Animal3 a = new Dog3();
        System.out.println(a.num);
        System.out.println("-----");
        a.num = 15;
        System.out.println(a.num);

        System.out.println("----");
        System.out.println(a.num2);

        System.out.println("----");

        a.show();
        System.out.println("-----");
        a.method();

    }

}

abstract class Animal3{

    //成员变量
    public  int num = 10;
    public  final  int num2 = 100;

    //构造方法
    public Animal3(){}
    public Animal3( String name, int age){

    }

    //成员方法
    public abstract void show();

    public void method(){
        System.out.println("show method");
    }


}



class Dog3 extends Animal3{
    public void show(){
        System.out.println("shou Dog");
    }

}
