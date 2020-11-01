package cn.itcast.code.day16.StaticImportLearn;
/*
        静态导入概述
        格式：import static 包名….类名.方法名;
        可以直接导入到方法的级别
        注意事项
        方法必须是静态的
        如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。

 */
import static java.lang.Math.abs;
import  static java.lang.Math.max;
import static java.lang.Math.pow;

public class StaticImportLearn {
    public static void main(String[] args) {

        System.out.println(abs(-100));
        System.out.println(pow(2,3));
        System.out.println(max(20,30));

        System.out.println("--------------");
        System.out.println(java.lang.Math.pow(3,3));


    }
}
