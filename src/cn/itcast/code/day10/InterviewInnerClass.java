package cn.itcast.code.day10;

public class InterviewInnerClass {
    public static void main(String[] args) {
        Outer2.Inner2 oi = new Outer2().new Inner2();
        oi.show();

    }
}

class Outer2{
    public int num = 10;

    class Inner2{
        public int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer2.this.num);

        }

    }
}
