package cn.itcast.code.day10;

public class ParameterInterfacetTest {
    public static void main(String[] args) {
        HobbyDemo hd = new HobbyDemo();
        Hobby h = new Teacher1();
        hd.method(h);
    }
}


interface Hobby{
    public abstract void hobby();
}


class HobbyDemo{
    public void method(Hobby h){
        h.hobby();
    }
}

class Teacher1 implements Hobby{

    public void hobby() {
        System.out.println("老师爱学生");
    }
}