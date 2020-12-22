package cn.itcast.code.day24.DesignPatterns.LazyBoyPatterns;
/*
    如何保证类在内存中只有一个对象呢?
    		A：把构造方法私有
    		B:在成员位置自己创建一个对象
    		C:通过一个公共的方法提供访问
 */

public class LazyBoy {

    // 构造私有
    private LazyBoy(){

    }

    //自己造一个
    // 静态方法只能访问静态成员变量，加静态
    // 为了不让外界直接访问修改这个值，加private
    private static LazyBoy lb = new LazyBoy();


    //提供公共的访问方式
    //为了保证外界能够直接使用该方法，加静态
    public static LazyBoy getLazyBoy(){
        return lb;
    }


}
