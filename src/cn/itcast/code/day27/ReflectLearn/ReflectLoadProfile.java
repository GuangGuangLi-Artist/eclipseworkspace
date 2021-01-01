package cn.itcast.code.day27.ReflectLearn;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectLoadProfile {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        //加载键值对数据
        Properties pro = new Properties();
        FileReader fr = new FileReader("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day27\\ReflectLearn\\Profile\\class.properties");
        pro.load(fr);
        fr.close();


        //获取数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("method");

        //反射
        Class newC = Class.forName(className);

        //创建对象
        Constructor con = newC.getConstructor();
        Object newObj = con.newInstance();

        //对象调用方法
        Method newMethod = newC.getMethod(methodName);
        newMethod.invoke(newObj);

    }
}
