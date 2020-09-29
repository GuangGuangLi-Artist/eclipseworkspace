package cn.itcast.code.day10;

public class ParameterAbstractTest {
    public static void main(String[] args) {

        Person1Demo pd = new Person1Demo();
        Person1 p = new Student1();
        pd.method(p);

    }
}

//c抽象类
abstract class Person1{
    public abstract void study();
}



class Person1Demo{
    public void method(Person1 p){
        p.study();
    }
}

//具体类
class Student1 extends Person1{
    public void study(){
        System.out.println("good good study");
    }
}
