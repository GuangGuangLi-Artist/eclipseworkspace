package cn.itcast.code.day13.IntegerLearn;
/*
    包装和拆箱
     自动装箱：把基本类型转化为包装类类型
     自动拆箱：把包装类类型转化为基本类型
     注意：
        在使用时，Integer  x = null;上面的代码就会出现NullPointerException。
        建议先判断是否为null,然后再使用

 */

public class PackagingAndUnpacking {
    public static void main(String[] args) {
        //定义一个int类型的包装类类型
        //Integer i = new Integer(100);

        Integer ii = 100;
        ii += 200;
        System.out.println("ii:" + ii);

        /*
            {
                Integer ii = Integer.valueOf(100);//自动装箱
                ii = Integer.valueOf(ii.intValue() + 200);//自动拆箱再自动装箱
                System.out.println("ii:" + ii);
                }
         */


        Integer iii = null;//NullPointerException
        if(iii != null){
            iii += 300;
            System.out.println("iii:" + iii);
        }



    }
}
