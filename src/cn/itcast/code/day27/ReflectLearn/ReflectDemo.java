package cn.itcast.code.day27.ReflectLearn;
/*
    使用反射越过泛型检查
        我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        ArrayList<Integer> arr = new ArrayList<>();
        //arr.add("java");//有泛型检查，会报错

        //获取字节码对象
        Class cArr = arr.getClass();
        Method mArr = cArr.getMethod("add", Object.class);
        mArr.invoke(arr,"hello");
        mArr.invoke(arr,"world");
        mArr.invoke(arr,"java");

        System.out.println(arr);
    }
}
