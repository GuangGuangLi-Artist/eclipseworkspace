package cn.itcast.code.day10;

public class InnerClassModifier {
    public static void main(String[] args) {

        //成员内部内被静态修饰后的访问
        // 访问方式1
        Outer1.Inner1 oi = new Outer1.Inner1();
        oi.show();
        oi.show2();

        //访问方式2
        Outer1.Inner1.show2();



    }
}

/*
成员内部类的修饰符
    案例：人的身体
 */

/*class Body{
    private class Heart{
        public void operator(){
            System.out.println("心脏搭桥");
        }
    }

    public void method(){
        if("你是外科医生"){
            Heart h = new Heart();
            h.operator();
        }
    }
}*/
class Outer1{
    private static int num = 10;
    public static class Inner1{
        public void show(){
            System.out.println(num);
        }

        public static void show2(){
            System.out.println(num);
        }
    }


}


