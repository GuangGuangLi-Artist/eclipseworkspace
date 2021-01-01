package cn.itcast.code.day27.ReflectLearn.Patterns.DecoratorsDesign;

public class MusicPhoneDecorate  extends PhoneDecorate{
    public MusicPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("手机可以听音乐");
    }
}
