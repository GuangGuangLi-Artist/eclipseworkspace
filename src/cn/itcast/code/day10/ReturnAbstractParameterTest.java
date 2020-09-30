package cn.itcast.code.day10;

public class ReturnAbstractParameterTest {
    public static void main(String[] args) {
        Person4Demo sd = new Person4Demo();
        sd.getPerson().study();
    }
}


abstract class Person4{
    public abstract void study();
}



class Student4 extends Person4{
    public void study(){
        System.out.println("good good study");
    }
}



class Person4Demo{
    public Person4 getPerson(){
        return new Student4();
    }
}
