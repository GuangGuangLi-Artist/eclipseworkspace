package cn.itcast.code.day27.ReflectLearn;
/*
    反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。

    Person p = new Person();
    p.使用

    要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
    Class类：
            成员变量	Field
            构造方法	Constructor
            成员方法	Method

    获取class文件对象的方式：
    A:Object类的getClass()方法
    B:数据类型的静态属性class
    C:Class类中的静态方法
            public static Class forName(String className)

    一般我们到底使用谁呢?
            A:自己玩	任选一种，第二种比较方便
            B:开发	第三种
                为什么呢?因为第三种是一个字符串，而不是一个具体的类名。这样我们就可以把这样的字符串配置到配置文件中。
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectLearn {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {


        //方式一
        PersonLearn p = new PersonLearn();
        Class c = p.getClass();

        PersonLearn p2 = new PersonLearn();
        Class c2 = p2.getClass();

        System.out.println(p == p2);
        System.out.println(c == c2);


        //方式2

        Class c3 = PersonLearn.class;
        System.out.println(int.class);
        System.out.println(c == c3);


        //方式3

        Class c4 = Class.forName("cn.itcast.code.day27.ReflectLearn.PersonLearn");
        System.out.println(c == c4);


        //反射获取构造方法并使用

        //获取字节码文件对象
        Class c5 = Class.forName("cn.itcast.code.day27.ReflectLearn.PersonLearn");

        //获取构造方法
        //public Constructor<?>[] getConstructors() throws SecurityException
        /*Constructor[] con = c5.getConstructors();
        for(Constructor cr:con){
            //public cn.itcast.code.day27.ReflectLearn.PersonLearn(java.lang.String,int,java.lang.String)
            //public cn.itcast.code.day27.ReflectLearn.PersonLearn()
            System.out.println(cr);
        }*/

        //获取单个构造方法
        //public Constructor<T> getConstructor(Class<?>... parameterTypes) throws NoSuchMethodException,SecurityException
        Constructor con = c5.getConstructor();//返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
        System.out.println(con);

        //public T newInstance(Object... initargs) throws InstantiationException, IllegalAccessException,IllegalArgumentException, InvocationTargetException
        //过调用此对象表示的构造方法来创建的新对象

        Object obj = con.newInstance();
        System.out.println(obj);

        PersonLearn pl = (PersonLearn)obj;
        pl.show();

        //需求：通过反射去获取该构造方法并使用
        System.out.println("通过反射去获取该构造方法并使用");

        // 获取带参构造方法对象
        Constructor cs = c5.getConstructor(String.class,int.class,String.class);

        //通过带参构造方法对象创建对象
        //public T newInstance(Object... initargs)
        Object objParam = cs.newInstance("liguang",25,"xian");
        System.out.println(objParam);


        //通过反射获取私有构造方法并使用
        System.out.println("通过反射获取私有构造方法并使用");


        //获取私有构造方法对象
        Constructor cPrivate = c5.getDeclaredConstructor(String.class);

        //该私有构造方法创建对象

        cPrivate.setAccessible(true);//值为true则指示反射的对象在使用时应该取消Java语言访问检查。
        Object onPrivate = cPrivate.newInstance("subiao");//IllegalAccessException:
        System.out.println(onPrivate);


        System.out.println("通过反射获取成员变量并使用");

        //第一步 获取字节码码对象

        //第二步  获取所有的成员变量
        //Field[] fields = c5.getFields();
        Field[] fields = c5.getDeclaredFields();

        for(Field fi:fields){
            System.out.println("    " + fi);
        }

        System.out.println("-----");
        //第三步，通过无参构造方法创建对象
        Constructor con1 = c5.getConstructor();
        Object obje = con1.newInstance();
        System.out.println(obje);

        //获取单个的成员变量
        Field genderField = c5.getField("gender");
        genderField.set(obje,"西安");
        System.out.println(obje);

        //获取私有修饰的name
        Field nameField = c5.getDeclaredField("name");
        //需要暴力访问
        nameField.setAccessible(true);
        nameField.set(obje,"大笔");
        System.out.println(obje);

        //获取默认修饰的age
        Field ageField = c5.getDeclaredField("age");
        ageField.set(obje,20);
        System.out.println(obje);


        System.out.println("    " + "通过反射获取无参无返回值成员方法");
        //第一步，获取字节码文件对象
        //第二步，获取所有方法
        //Method[] me = c5.getDeclaredMethods();//获取自己的所有方法
       /* Method[] me = c5.getMethods();//获取自己包括父亲的公共方法
        for(Method m:me){
            System.out.println(m);
        }*/


       //第三步，获取私有构造对象创建方法并创建对象
        //Constructor con1 = c5.getConstructor();
        //Object obje = con1.newInstance();

        //第四步，获取单个方法并使用
        //public Method getMethod(String name,Class<?>... parameterTypes)throws NoSuchMethodException,SecurityException
        //返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
        //name - 方法名
        //parameterTypes - 参数列表

        Method m = c5.getMethod("show");

        //public Object invoke(Object obj, Object... args)throws IllegalAccessException,IllegalArgumentException,InvocationTargetException
        m.invoke(obje);//调用obje对象的m1方法

        //带参无返回值
        Method mHaveParam = c5.getMethod("method", String.class);
        mHaveParam.invoke(obje,"hello");

        //带参有返回值
        Method mHavParamAndReturn = c5.getMethod("getString", String.class, int.class);
        Object obgmethod = mHavParamAndReturn.invoke(obje,"world",1000);
        System.out.println(obgmethod);


        //私有方法
        Method mprivate =c5.getDeclaredMethod("function");
        mprivate.setAccessible(true);
        mprivate.invoke(obje);













    }
}
