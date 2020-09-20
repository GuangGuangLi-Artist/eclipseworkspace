package cn.itcast.code.day09;

public class FinalLocalvariable {

    public static void main(String[] args) {
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 20;
        //Error:(10, 9) java: 无法为最终变量y分配值
        //y = 200;
        System.out.println(y);

        System.out.println("-----");
        Student s = new Student();
        System.out.println(s.age);

        s.age = 40;
        System.out.println(s.age);

        System.out.println("-----");
        final Student ss = new Student();
        System.out.println(ss.age);
        ss.age = 100;
        System.out.println(ss.age);


        //重新分配内存空间
        //ss = new Student();
    }
}


class Student{
    int age = 30;
}