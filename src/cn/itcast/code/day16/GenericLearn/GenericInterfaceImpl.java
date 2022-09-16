package cn.itcast.code.day16.GenericLearn;
/*
    泛型接口的使用
        第一种情况，实现类的时候就已经知道是什么类型
        第二种情况，实现类的时候就不知道是什么类型

 */
/*第一种情况  不常见
public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void show(String t) {
        System.out.println(t);
    }
}*/

public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}


