package cn.itcast.code.day27.ReflectLearn.Patterns.DecoratorsDesign;

public class RingPhoneDecorate extends  PhoneDecorate{
    public RingPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {

        System.out.println("手机可以听彩铃");
        super.call();
    }
}
