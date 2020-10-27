package cn.itcast.code.day16.GenericLearn;

/*
    泛型由来
        为什么会有泛型呢?
            通过案例引入
            早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
    泛型类
	把泛型定义在类上
		格式:public class 类名<泛型类型1,…>
		注意:泛型类型必须是引用类型

 */
public class GenericClass<T> {
    private  T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
