package cn.itcast.code.day16.GenericLearn;
/*
    泛型方法的测试
 */

public class GenericFunctionTest {
    public static void main(String[] args) {


       /* GenericFunction<String> gf = new GenericFunction<>();
        gf.show("风清扬");

        System.out.println("------------");

        GenericFunction<Integer> gf2 = new GenericFunction<>();
        gf2.show(100);
        System.out.println("--------------");

        GenericFunction<Boolean> gf3 = new GenericFunction<>();
        gf3.show(true);
        System.out.println();*/


       GenericFunction gf = new GenericFunction();
       gf.show("风清扬");

        System.out.println("------------");

        GenericFunction gf2 = new GenericFunction();
        gf2.show(100);
        System.out.println("--------------");

        GenericFunction gf3 = new GenericFunction();
        gf3.show(true);
        System.out.println();
    }
}
