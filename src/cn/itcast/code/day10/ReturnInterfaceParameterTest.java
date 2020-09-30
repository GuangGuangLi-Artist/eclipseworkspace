package cn.itcast.code.day10;

public class ReturnInterfaceParameterTest {

    public static void main(String[] args) {
        Hobby1Demo hd = new Hobby1Demo();
        hd.getHobby().study();

    }
}


interface Hobby1{
    public abstract void study();
}


class Hobby1Demo{
    public Hobby1 getHobby(){
//        Hobby1 h = new Student5();
//        return h;

        return new Student5();
    }
}

class Student5 implements Hobby1{
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}