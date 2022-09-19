package cn.itcast.code.day22.IOLearn;
/*
    我有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”

分析：
		A:把文件中的数据加载到集合中
		B:遍历集合，获取得到每一个键
		C:判断键是否有为"lisi"的，如果有就修改其值为"100"
		D:把集合中的数据重新存储到文件中
 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {

        //A:把文件中的数据加载到集合中
        Properties pp = new Properties();
        Reader r = new FileReader("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\user.txt");
        pp.load(r);

        r.close();

        //遍历集合
        Set<String> ps = pp.stringPropertyNames();
        for (String key: ps){
            //判断键是否有为"lisi"的，如果有就修改其值为"100"
            if("lisi".equals(key)){
                pp.setProperty(key,"100");
                break;
            }
        }

        //把集合中的数据重新存储到文件中
        Writer w = new FileWriter("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\user.txt");
        pp.store(w,"new File");
        w.close();



    }
}
