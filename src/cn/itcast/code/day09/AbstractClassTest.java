package cn.itcast.code.day09;

/*
	猫狗案例
		具体事物：猫，狗
		共性：姓名，年龄，吃饭

	分析：从具体到抽象
		猫:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(猫吃鱼)

		狗:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(狗吃肉)

		因为有共性的内容，所以就提取了一个父类。动物。
		但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
		而方法是抽象的类，类就必须定义为抽象类。

		抽象动物类：
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();

	实现：从抽象到具体
		动物类:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();

		狗类：
			继承自动物类
			重写吃饭();

		猫类：
			继承自动物类
			重写吃饭();
 */
public class AbstractClassTest {
    public static void main(String[] args) {

        Dog4 d = new Dog4();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+"---"+d.getAge());
        d.eat();
        //方式2：
        Dog4 d2 = new Dog4(3,"旺财");
        System.out.println(d2.getName()+"---"+d2.getAge());
        d2.eat();
        System.out.println("---------------------------");

        Animal4 a = new Dog4();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName()+"---"+a.getAge());
        a.eat();

        Animal4 a2 = new Dog4(3,"旺财");
        System.out.println(a2.getName()+"---"+a2.getAge());
        a2.eat();

    }
}

abstract  class Animal4{
    private int age;
    private String name;
    public Animal4(){}

    public Animal4(int age, String name){
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
}

class Dog4 extends Animal4{
    public Dog4(){}

    public Dog4(int age, String name){
       super(age,name);
    }

    public void eat(){
        System.out.println("狗狗吃肉");
    }



}

class Cat4 extends Animal4{
    public Cat4(){}

    public Cat4(int age, String name){
        super(age,name);
    }

    public void eat(){
        System.out.println("猫猫吃肉");
    }
}
