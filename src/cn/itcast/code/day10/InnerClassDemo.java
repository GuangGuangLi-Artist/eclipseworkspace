package cn.itcast.code.day10;

public class InnerClassDemo {
    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        oc.method();


    }
}


class OuterClass{

    private int num = 10;

    class InnerClass{
        public void show(){
            //内部类可以直接访问外部类的成员，包括私有
            System.out.println(num);
        }



    }

    public void method(){
        InnerClass ic = new InnerClass();
        ic.show();
    }
}
