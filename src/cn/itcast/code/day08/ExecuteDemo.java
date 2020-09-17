package cn.itcast.code.day08;

public class ExecuteDemo {

    public static void main(String[] args) {

    }
}


class Fu{
    private int num1 = 200;
    public  int num2 = 100;

    public void show(){
        System.out.println("非私有方法");
    }

    private void method(){
        System.out.println("私有方法");
    }
}


class Zi extends  Fu{

}