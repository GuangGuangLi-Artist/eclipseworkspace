package cn.itcast.code.day08;

/*
Error:(29, 29) java: 无法将类 cn.itcast.code.day08.Fu1中的构造器 Fu1应用到给定类型;
  需要: java.lang.String
  找到: 没有参数
  原因: 实际参数列表和形式参数列表长度不同
 */

public class ExtendsConstructionMethod {
    public static void main(String[] args) {
        Son1 s = new Son1();
        System.out.println("-------");
        Son1 ss = new Son1("林青霞");

    }
}


class Fu1{


    /*public Fu1(){
        System.out.println("Fu的无参构造方法");
    }*/
    public Fu1(String name){
        System.out.println("Fu的带参构造方法");
    }

}


class Son1 extends Fu1{


    public Son1(){


        super("随便给一个");
        System.out.println("Son的无参构造方法");
    }

    public Son1(String name){
        this();
        //super("随便给一个'");//方式一,使用super
        System.out.println("Son的带参构造方法");
    }


}