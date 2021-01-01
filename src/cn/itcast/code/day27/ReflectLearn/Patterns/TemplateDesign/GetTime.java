package cn.itcast.code.day27.ReflectLearn.Patterns.TemplateDesign;

public  abstract class GetTime {

    public long getTime(){
        long start = System.currentTimeMillis();

        //中间具体处理功能的代码
        code();

        long end = System.currentTimeMillis();

        return end - start;
    }

    public abstract void code();
}
