package cn.itcast.code.day27.ReflectLearn.Patterns.TemplateDesign;

public class ForDemo extends GetTime {

    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
