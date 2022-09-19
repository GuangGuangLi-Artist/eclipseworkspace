package cn.itcast.code.day22.IOLearn;
/*
    Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
    Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。

    是Hashtable的子类，说明是一个Map集合。
    特殊功能：
    public Object setProperty(String key,String value)：添加元素
    public String getProperty(String key):获取元素
    public Set<String> stringPropertyNames():获取所有的键的集合

    这里的集合必须是Properties集合：
    public void load(Reader reader):把文件中的数据读取到集合中
    public void store(Writer writer,String comments):把集合中的数据存储到文件
 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesLearn {
    public static void main(String[] args) throws IOException {
        //Properties 作为集合的使用
        Properties p = new Properties();
        p.put("001","hello");
        p.put("002","world");
        p.put("003","java");

        //遍历集合
        Set<Object> s = p.keySet();

        for(Object key:s){
            Object value = p.get(key);
            System.out.println(key + "---" + value );
        }


        System.out.println("Properties: " + p);


        System.out.println("如下是特殊功能：");


        Properties pp = new Properties();
        //添加元素
        pp.setProperty("zhangsan","20");
        pp.setProperty("lisi","21");
        pp.setProperty("wangwu","202");

        //public Set<String> stringPropertyNames():获取所有的键的集合
        //遍历集合
        Set<String> ps = pp.stringPropertyNames();
        for(String key:ps){
            String value = pp.getProperty(key);

            //public String getProperty(String key):获取元素
            System.out.println(key + "---" + value);
        }


        //把文件中的数据读取到集合中
        myLoad();

        //把集合中的数据存储到文件
        myStore();


    }

    private static void myStore() throws IOException {

        //创建集合
        Properties pp = new Properties();
        pp.setProperty("林青霞","27");
        pp.setProperty("王祖贤","22");
        pp.setProperty("王明","21");
        pp.setProperty("胡锡进","20");

        //创建writer对象
        Writer wr = new FileWriter("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\write.txt");
        pp.store(wr,null);
        wr.close();



    }

    private static void myLoad() throws IOException {
        //读取文件中Map类型的数据
        Reader r = new FileReader("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\read.txt");

        //创建Properties对象
        Properties pp = new Properties();

        pp.load(r);
        r.close();

        //遍历集合
        Set<String> ppset = pp.stringPropertyNames();
        for(String key:ppset){
            String value = pp.getProperty(key);
            System.out.println(key + "----" + value);
        }
    }


}
