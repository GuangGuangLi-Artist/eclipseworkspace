package cn.itcast.code.day16.GenericLearn;
/*
    泛型方法的定义
    泛型方法
	把泛型定义在方法上
	格式:public <泛型类型> 返回类型 方法名(泛型类型 .)
 */

public class GenericFunction {


    public<T> void show(T t){
        System.out.println(t);
    }
}
