package cn.itcast.code.day10;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Outer4 o = new Outer4();
        o.method();

    }
}

interface Inner4{
    public abstract void show();
    public abstract void show2();
}

class Outer4{

    public void method(){
        /*new Inner4(){
            public void show(){
                System.out.println("show");
            }

            public void show2(){
                System.out.println("show2");
            }


        }.show();

        new Inner4(){
            public void show(){
                System.out.println("show");
            }

            public void show2(){
                System.out.println("show2");
            }


        }.show2();*/

        Inner4 i = new Inner4() {
            @Override
            public void show() {
                System.out.println("show");
            }

            @Override
            public void show2() {
                System.out.println("show2");

            }
        };
        i.show();
        i.show2();


    }
}



