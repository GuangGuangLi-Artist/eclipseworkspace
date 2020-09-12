package cn.itcast.code.day07;

public class ArgsTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        int res = d.sum(10,20);
        System.out.println(res);

        //形式参数是引用类型的调用
        Student s = new Student();
        StudentDemo sd = new StudentDemo();
        sd.method(s);

    }
}

//形式参数是基本类型
class Demo{
    public  int sum( int a, int b){
         int result = a + b;
         return result;
    }
}

//形式参数是引用类型
//引用类型：类、接口、数组
class Student{
    public void show(){
        System.out.println("我爱学习");
    }
}

class StudentDemo{
    public void method(Student s){
        s.show();

    }
}


