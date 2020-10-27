package cn.itcast.code.day16.GenericLearn;
/*
    泛型类的测试

 */

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass ot = new GenericClass();

        ot.setObj(new String("java"));
        String s = (String)ot.getObj();
        System.out.println("姓名是：" + s);

        ot.setObj(new Integer(30));
        Integer i = (Integer)ot.getObj();
        System.out.println("年龄是：" + i);

        /*ot.setObj(new String("java"));
        //ClassCastException
        Integer ii = (Integer) ot.getObj();
        System.out.println("姓名是：" + s);*/

        System.out.println("-----------");
        System.out.println("下面是标准使用");

        GenericClass<String> gc = new GenericClass<>();
        //gc.setObj(Integer(100));这个时候编译期间就过不去
        gc.setObj(new String("liguang"));
        String s1 = gc.getObj();
        System.out.println("姓名是:" + s1);

        System.out.println("-----------");

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setObj(new Integer(100));
        Integer iii = gc2.getObj();
        System.out.println("年龄是：" + iii);






    }
}
