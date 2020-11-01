package cn.itcast.code.day16.ArgsLearn;
/*
    可变参数概述及使用
	可变参数概述
		定义方法的时候不知道该定义多少个参数
	格式
		修饰符 返回值类型 方法名(数据类型…  变量名){}
	注意：
		这里的变量其实是一个数组
		如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
		Arrays工具类中的一个方法
		public static <T> List<T> asList(T... a)  把数组转成集合
		注意事项：
		    虽然可以把数组转成集合，但是集合的长度不能改变
 */

import java.util.Arrays;
import java.util.List;

public class ArgsLearn {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));
        int c = 40;
        System.out.println(sum(a,b,c));

        System.out.println(sum(a,b,c,50));


        System.out.println("----------");
        //public static <T> List<T> asList(T... a)  把数组转成集合

        String [] strArr = {"java","hello","world"};
        List<String> list = Arrays.asList(strArr);

        //list.add("python");UnsupportedOperationException
        //list.remove(1);
        list.set(1,"C++");

        for(String s: list){
            System.out.println(s);
        }




    }

    public static int sum(int... a){
        int s = 0;
        for(int x: a){
            s += x;
        }
        return s;
    }
}
