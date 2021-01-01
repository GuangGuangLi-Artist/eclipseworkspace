package cn.itcast.code.day27.ReflectLearn.Patterns.DecoratorsDesign;

public class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("手机可以打电话了");
    }
}
