package cn.itcast.code.day10;

public class PartialInnerClass {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.show();

    }
}

class Outer3{
    private int num = 10;

    public void show(){

        final int num2 = 20;
        class Inner3{
            public void method(){
                System.out.println(num);

                System.out.println("----");

                System.out.println(num2);
            }
        }

        Inner3 i = new Inner3();
        i.method();
    }
}
