package cn.itcast.code.day09;

/*
A:提高了代码的维护性（继承保证）
B:提高了代码的扩展性 （多态保证）
 */

public class PolymorphismGood {
    public static void main(String[] args) {

        Pig p = new Pig();
        AnimalTool.useAnimal(p);
        System.out.println("----");

        Dog d = new Dog();
        AnimalTool.useAnimal(d);




    }


}


class Animal{
    public Animal(){}

    public void eat(){
        System.out.println("eat");

    }

    public  void sleep(){
        System.out.println("sleep");

    }
}


class Pig extends Animal{

    public void eat(){
        System.out.println("猪吃包菜");

    }

    public  void sleep(){
        System.out.println("猪爱睡觉");

    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");

    }

    public  void sleep(){
        System.out.println("狗不爱睡觉");

    }

}


class AnimalTool{

    private AnimalTool(){}



    public static  void useAnimal(Animal a){
        a.eat();
        a.sleep();
    }
}
