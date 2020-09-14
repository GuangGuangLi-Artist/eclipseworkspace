package cn.itcast.code.day07;

public class KeyStaticDemo {
    public static void main(String[] args) {
        Person p = new Person("liguang",12,"zh-cn");
        p.show();
        System.out.println("------");
        Teacher t = new Teacher();
        t.show();
        t.method();


    }
}



class Person{
    String name;
    int age;
    String country;
    public Person(){}


    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void show(){
        System.out.println("姓名: " + name + " ,年龄: " + age + " ,国籍 " + country);
    }
}

class Teacher{
    public int num = 10;
    public static int  num2 = 20;


    public void show(){
        System.out.println(this.num);
        System.out.println(num2);

        //非静态方法都可以访问
        function();
        function();
    }

    public static void method(){

        //Error:(68, 28) java: 无法从静态上下文中引用非静态 变量 this
        System.out.println(num2);
        function2();

        //Error:(83, 9) java: 无法从静态上下文中引用非静态 方法 function()
        //function();
    }

    public void function(){
        System.out.println("function--非静态方法");
    }

    public static void function2(){
        System.out.println("function  --- 静态方法");
    }
}