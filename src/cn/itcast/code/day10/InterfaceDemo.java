package cn.itcast.code.day10;

public class InterfaceDemo {
    public static void main(String[] args) {

    }
}


interface speak{

    //接口的成员方法只能是抽象的
    public abstract void speak();
}

abstract class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //用于强制子类做的事情
    public abstract void  eat();


    public void sleep(){
        System.out.println("人都是要睡觉的");
    }
}

abstract class SportsMan extends Person{

    public SportsMan(){}

    public SportsMan(String name, int age){
        super(name, age);
    }

    public abstract void study();

}

abstract class Coach extends Person{

    public Coach(){}

    public Coach(String name, int age){
        super(name, age);
    }

    public abstract void teach();

}

//定义具体的类
class PingPangSportsMan extends SportsMan implements speak{

    public PingPangSportsMan(){}

    public PingPangSportsMan(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("乒乓球吃小米");


    }

    public void study(){
        System.out.println("学习接球和发球");
    }

    public void speak(){
        System.out.println("学习说英语");
    }
}

class BasketBallSportsMan extends SportsMan{

    public BasketBallSportsMan(){}

    public BasketBallSportsMan(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("篮球吃肉");


    }

    public void study(){
        System.out.println("学习运球和传球");
    }


}

class PingPangCoach extends Coach implements speak{

    public PingPangCoach(){}

    public PingPangCoach(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("乒乓球教练吃大米");


    }

    public void teach(){
        System.out.println("教接球和发球");
    }

    public void speak(){
        System.out.println("学习说英语");
    }
}

class BasketBallCoach extends Coach{

    public BasketBallCoach(){}

    public BasketBallCoach(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("篮球教练吃蔬菜");


    }

    public void teach(){
        System.out.println("教运球和传球");
    }


}

