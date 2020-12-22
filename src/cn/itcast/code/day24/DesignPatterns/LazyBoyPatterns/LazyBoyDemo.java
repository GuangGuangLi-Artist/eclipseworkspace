package cn.itcast.code.day24.DesignPatterns.LazyBoyPatterns;

public class LazyBoyDemo {
    public static void main(String[] args) {


        LazyBoy ly1 = LazyBoy.getLazyBoy();
        LazyBoy ly2 = LazyBoy.getLazyBoy();


        System.out.println(ly1 == ly2);

        //LazyBoy.lb = null;
    }
}
