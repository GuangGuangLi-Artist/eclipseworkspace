package cn.itcast.code.day08;

/**
 * A：成员变量的问题
 *  1：int x = 10;成员变量是基本类型
 *  2：Student s = new Student() 成员变量是引用类型
 * B: 一个类的初始化过程
 *  成员变量的初始化
 *      默认初始化
 *      显示初始化
 *      构造方法初始化
 * C:子父类的初始化
 *  先进行父类的初始化，再进行子类的初始化
 */

public class ExtendsInterviewThird {
}



class X{
    Y b = new Y();
    X(){
        System.out.println("X");
    }

}

class Y{
    Y() {
        System.out.println("Y");
    }
}


class Z extends X{
    Y y = new Y();
    Z(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}