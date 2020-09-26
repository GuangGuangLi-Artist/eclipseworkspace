package cn.itcast.code.day09;

public class AbstractClassDemo {

    public static void main(String[] args) {


        //Error:(7, 21) java: cn.itcast.code.day09.Animal2是抽象的; 无法实例化
        //Animal2 a = new Animal2();


        //多态实现抽象类的实例化
        Animal2 a = new Dog2();
        a.eat();

    }
}


abstract class Animal2{


    //空方法体  Error:(15, 26) java: 抽象方法不能有主体
    //public abstract void eat(){}


    //没有方法体
    public abstract void eat();

    public Animal2(){}

}

//子类是抽象类
abstract class Cat2 extends Animal2{}


//子类是具体类，重写抽象方法
class Dog2 extends Animal2{

    public void eat(){
        System.out.println("狗狗吃肉");
    }

}
