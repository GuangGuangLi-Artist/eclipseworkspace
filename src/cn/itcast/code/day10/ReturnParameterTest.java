package cn.itcast.code.day10;

public class ReturnParameterTest {

    public static void main(String[] args) {


        Student3Demo sd = new Student3Demo();
        sd.getStudent().study();
    }
}

class Student3{
    public void study(){
        System.out.println("good good study");
    }
}

class Student3Demo{
    public Student3 getStudent(){
        return new Student3();
    }
}
