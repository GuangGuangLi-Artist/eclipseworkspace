package cn.itcast.code.day09;



public class InterfaceMember {
    public static void main(String[] args) {
        InteraceAnimail2 ia = new DogImpl();
        System.out.println(ia.num1);
        System.out.println(ia.num2);
        System.out.println(ia.num3);


        System.out.println("----");

        System.out.println(InteraceAnimail2.num1);
        System.out.println(InteraceAnimail2.num2);
    }
}


interface InteraceAnimail2{

    //成员变量
    public static final int num1 = 10;
    int num2 = 20;
    final int num3 = 30;


    //没有构造方法
    //public InteraceAnimail2();


    //成员方法 默认public abstract
    public abstract void show();
}

class DogImpl extends Object implements InteraceAnimail2{
    public DogImpl(){
        super();
    }

    public void show(){

    }

}
