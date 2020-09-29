package cn.itcast.code.day10;

public class ParameterTest {

    public static void main(String[] args) {

        //类作为参数传递
        StudyDemo sd = new StudyDemo();
        Student s = new Student();
        sd.method(s);
        System.out.println("----");

        //匿名调用
        new StudyDemo().method(new Student());

    }
}

class Student {
    public void study(){
        System.out.println("good good  study, day day up");
    }
}

class StudyDemo{

    public void method(Student s ){
        s.study();
    }
}
