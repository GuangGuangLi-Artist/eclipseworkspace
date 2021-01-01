package cn.itcast.code.day27.ReflectLearn.Patterns.TemplateDesign;

public class GetTimeDemo {
    public static void main(String[] args) {


        GetTime gt = new ForDemo();
        System.out.println(gt.getTime() + "毫秒");
    }
}
