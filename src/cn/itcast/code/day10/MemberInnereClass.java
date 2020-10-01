package cn.itcast.code.day10;

public class MemberInnereClass {
    public static void main(String[] args) {

        //访问内部类的show()方法
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

    }
}


class Outer{
    private int num = 10;

    //成员内部类
    class Inner{
        public void show(){
            System.out.println(num);
        }
    }
}