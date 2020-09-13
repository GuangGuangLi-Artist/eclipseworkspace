package cn.itcast.code.day07;

public class KeyStaticDemo2 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.num2);
        System.out.println(Student3.num2);
        System.out.println(s.num);
    }
}

class Student3{

    int num = 10;

    static  int num2 = 20;

}
