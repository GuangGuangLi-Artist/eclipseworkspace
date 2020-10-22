package cn.itcast.code.day14.SystemLearn;

import java.util.Arrays;

/*
    System类概述
        System 类包含一些有用的类字段和方法。它不能被实例化。
    成员方法
        public static void gc()//运行垃圾回收器。
        public static void exit(int status) 终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
        public static long currentTimeMillis()  返回以毫秒为单位的当前时间。
        public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 */
public class SystemLearn {
    public static void main(String[] args) {

        System.out.println("我们喜欢林青霞");
//        System.exit(0);
//        System.out.println("我们喜欢赵雅芝");

        System.out.println(System.currentTimeMillis());

        long start = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            System.out.println("hello: " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" + (end-start));

        int [] arr = {1,2,3,45,6,7,8,9};
        int [] arr2 = {11,2,34,55,66};

        System.arraycopy(arr,1,arr2,2,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
