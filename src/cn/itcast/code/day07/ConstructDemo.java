package cn.itcast.code.day07;

/*
构造方法
 */
public class ConstructDemo {

    public static void main(String[] args) {
        //创建对象
        Student2 s = new Student2();
        System.out.println(s);

        Student2 s2 = new Student2("林青霞");
        s2.show();
        Student2 s3 = new Student2(18);
        s3.show();

        Student2 s4 = new Student2("林青霞",18);
        s4.show();




    }
}


class Student2{
    private String name;
    private  int age;
    //创建构造方法
    public Student2(){
        System.out.println("这是无参构造方法");
    }

    //构造方法重载
    public  Student2(String name){
        System.out.println("这是带一个String类型的构造方法");
        this.name = name;
    }

    public  Student2(int age){
        System.out.println("这是带一个int类型的构造方法");
        this.age = age;
    }

    public Student2(String name,int age){
        this.name = name;
        this.age =age;
    }

    public void show(){
        System.out.println(name + "---" + age);
    }

}
