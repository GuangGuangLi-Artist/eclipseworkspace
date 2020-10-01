package cn.itcast.code.day10;

public class AnonymousInnerInuseClass {
    public static void main(String[] args) {

        //测试
        PersonDemo pd = new PersonDemo();
        Person6 p = new Student6();
        pd.method(p);

        System.out.println("------");


        //匿名内部类在开发中的使用
        //匿名内部类的本质是继承类或者实现了接口的子类匿名对象
        pd.method(new Person6() {
            @Override
            public void study() {
                System.out.println("好好学习，天天向上");
            }
        });


    }
}


interface Person6{
    public abstract void study();

}

class PersonDemo{
    public void method(Person6 p){
        p.study();
    }
}


//实现类
class Student6 implements Person6{
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
