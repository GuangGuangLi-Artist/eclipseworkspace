package cn.itcast.code.day09;

public class PolymorphisCatDog {
    public static void main(String[] args) {

        //内存中是狗
        Animal1 a = new Dog1();
        a.eat();
        System.out.println("--------");

        //还原成狗
        Dog1 d  = (Dog1) a;
        d.eat();
        d.lookDoor();

        System.out.println("------------");

        //内存中是猫
        a = new Cat1();
        a.eat();

        System.out.println("--------------");
        //还原成猫
        Cat1 c = (Cat1) a;
        c.eat();
        c.playGame();
        System.out.println("------------");

        //内存中是猫
        /*
        Exception in thread "main" java.lang.ClassCastException: cn.itcast.code.day09.Cat1 cannot be cast to cn.itcast.code.day09.Dog1
	    at cn.itcast.code.day09.PolymorphisCatDog.main(PolymorphisCatDog.java:15)

	    ClassCastException：一般在多态中的向下转型中出现
         */

        //演示错误的内容
        //Dog1 ddd = new Animal1();
        //Dog1 dddd = new Cat1();
        Dog1 dd = (Dog1)a;

    }
}


class Animal1{
    public void eat(){

    }
}


class Dog1 extends Animal1{
    public void eat(){
        System.out.println("狗狗吃肉");

    }


    public  void lookDoor(){
        System.out.println("狗看门");

    }

}


class Cat1 extends  Animal1{
    public void  eat(){
        System.out.println("猫吃鱼");

    }

    public  void playGame(){
        System.out.println("猫捉迷藏");

    }
}
