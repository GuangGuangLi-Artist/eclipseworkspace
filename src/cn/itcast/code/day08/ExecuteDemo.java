package cn.itcast.code.day08;

/**
 * 1:继承不能继承私有的成员变量和成员方法
 * 2：子类不能继承父类的构造方法
 */

public class ExecuteDemo {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
        System.out.println(zi.num2);

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