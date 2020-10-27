package cn.itcast.code.day16.GenericLearn;
/*
    泛型接口
        泛型接口
        把泛型定义在接口上
            格式:public  interface 接口名<泛型类型1…>

 */

public interface GenericInterface<T> {
    public abstract void show(T t);
}
