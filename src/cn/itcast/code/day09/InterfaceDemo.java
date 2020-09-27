package cn.itcast.code.day09;
/*
	猫狗案例,加入跳高的额外功能

	分析：从具体到抽象
		猫：
			姓名,年龄
			吃饭，睡觉
		狗：
			姓名,年龄
			吃饭，睡觉

		由于有共性功能，所以，我们抽取出一个父类：
		动物：
			姓名,年龄
			吃饭();
			睡觉(){}

		猫：继承自动物
		狗：继承自动物

		跳高的额外功能是一个新的扩展功能，所以我们要定义一个接口
		接口：
			跳高

		部分猫：实现跳高
		部分狗：实现跳高
	实现；
		从抽象到具体

	使用：
		使用具体类
 */

public class InterfaceDemo {
    public static void main(String[] args) {

        JumpDog jd = new JumpDog(2,"boli");
        jd.eat();
        jd.sleep();
        jd.jump();

    }

}

//定义跳高接口
interface Jumpping{
    public abstract  void jump();
}

//定义抽象类
abstract  class Animal7{
    private int age;
    private String name;
    public Animal7(){}

    public Animal7(int age, String name){
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

    public abstract void eat();

    public void  sleep(){
        System.out.println("睡觉觉了");
    }
}

//具体狗类
class Dog7 extends Animal7{
    public Dog7(){}

    public Dog7(int age, String name){
        super(age, name);
    }

    public void eat(){
        System.out.println("狗吃肉");
    }
}
//具体猫类
class Cat7 extends Animal7{
    public Cat7(){}

    public Cat7(int age, String name){
        super(age, name);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}

//有跳高功能的猫和狗

class JumpDog extends Dog7 implements Jumpping{

    public JumpDog(){}

    public JumpDog(int age, String name){
        super(age,name);
    }

    public void jump(){
        System.out.println("跳高狗");

    }
}

class JumpCat extends Cat7 implements Jumpping{

    public JumpCat(){}

    public JumpCat(int age, String name){
        super(age,name);
    }

    public void jump(){
        System.out.println("跳高猫");

    }
}
