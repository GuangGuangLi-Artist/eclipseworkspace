package cn.itcast.code.day27.ReflectLearn.DynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    public static void main(String[] args) {


        // 我们要创建一个动态代理对象
        // Proxy类中有一个方法可以创建动态代理对象
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[]
        // interfaces,InvocationHandler h)
        // 我准备对ud对象做一个代理对象
        UserDao ud = new UserDaoImp();
        MyInvocationHandler handler = new MyInvocationHandler(ud);

        UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(),ud.getClass().getInterfaces(),handler);


        proxy.add();
        proxy.delete();
        proxy.find();
        proxy.update();
        System.out.println("---------------");


        StudentDao sd = new StudentDaoImp();
        MyInvocationHandler sdhandle = new MyInvocationHandler(sd);
        StudentDao stuProxy = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),sd.getClass().getInterfaces(),sdhandle);
        stuProxy.register();
        stuProxy.login();
    }
}
