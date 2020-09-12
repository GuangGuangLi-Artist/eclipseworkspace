package cn.itcast.code.day07;

public class VariableDemo {

    public static void main(String[] args) {

        Variable v = new Variable();
        System.out.println(v.num);
        v.show();

    }
}

class Variable {

    //成员变量
    int num;

    public void show(){
        //局部变量
        int num2  = 20;

        //就近原则
        //int num = 100;
        //Variable 'num2' might not have been initialized
        System.out.println(num2);
        System.out.println(num);
    }
}



