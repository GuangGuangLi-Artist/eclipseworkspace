package cn.itcast.code.day09;

public class InterfaceFeatures {
    public static void main(String[] args) {
        AnimailTrain at = new Cat5();
        at.jump();
    }
}

interface AnimailTrain{
    public abstract void jump();

}

abstract class Dog5 implements AnimailTrain{

}


class Cat5 implements AnimailTrain{
    public void jump(){
        System.out.println("猫可以调高了");
    }

}
