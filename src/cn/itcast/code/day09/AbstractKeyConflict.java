package cn.itcast.code.day09;

public class AbstractKeyConflict {
    public static void main(String[] args) {
        Father.method();
    }
}

abstract class Father{


    public abstract void show();

    //Error:(11, 27) java: 非法的修饰符组合: abstract和private
    //private abstract void show();

    //Error:(14, 25) java: 非法的修饰符组合: abstract和final
    //final abstract void show();


    //Error:(19, 26) java: 非法的修饰符组合: abstract和static
    //static abstract void show();

    public static void method(){
        System.out.println("method");

    }
}

class Zi extends Father{
    public void show(){
        System.out.println("zi show");

    }

}
