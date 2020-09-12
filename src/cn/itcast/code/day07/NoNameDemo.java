package cn.itcast.code.day07;
/*
匿名对象
    就是没有名字的对象
匿名对象的应用场景
    1：调用方法，仅仅只调用一次的时候
    2：匿名对象调用完毕就是垃圾，可以被垃圾回收器回收
    3:匿名对象可以作为实际参数传递
 */

public class NoNameDemo {
    public static void main(String[] args) {
        //带名字的调用
        Student1 s = new Student1();
        s.show();

        //匿名对象
        new Student1().show();

        //匿名对象可以作为实际参数传递
        StudentDemo1 sd1 = new StudentDemo1();
        sd1.method1(new Student1());
    }
}

class Student1{
    public void show(){
        System.out.println("我爱学习");
    }


}

class StudentDemo1{
    public void method1(Student1 ss){
        ss.show();

    }
}

