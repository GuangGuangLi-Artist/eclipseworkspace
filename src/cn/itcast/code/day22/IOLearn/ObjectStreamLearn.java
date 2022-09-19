package cn.itcast.code.day22.IOLearn;
/*
    序列化流
        ObjectOutputStream
    反序列化流
        ObjectInputStream
    使用transient关键字声明不需要序列化的成员变量

 */

import java.io.*;

public class ObjectStreamLearn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        objectWrite();
        objectRead();
        
    }

    private static void objectWrite() throws IOException {

        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\oos.txt"));

        //创建对象
        Person p = new Person(27,"林青霞");

        //写入对象
        oos.writeObject(p);

        //释放资源
        oos.close();

    }

    private static void objectRead() throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\oos.txt"));

        Object obj = ois.readObject();

        ois.close();

        System.out.println(obj);
    }
}
