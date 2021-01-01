package cn.itcast.code.day27.ReflectLearn;

import java.lang.reflect.Field;

/*
    写一个方法，
    public void setProperty(Object obj, String propertyName, Object value){}，
    此方法可将obj对象中名为propertyName的属性的值设置为value
 */
public class Tool {

    public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {

        //需要使用反射

        //获取对象的字节文件
        Class newC = obj.getClass();

        //获取对象的成员变量
        Field newFiled  = newC.getDeclaredField(propertyName);

        //取消访问检查
        newFiled.setAccessible(true);

        //设置值
        newFiled.set(obj,value);
    }


}
