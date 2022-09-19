package cn.itcast.code.day21.IOLearn;
/*
        由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
    而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
    OutputStreamWriter = FileOutputStream + 编码表(GBK)
    FileWriter = FileOutputStream + 编码表(GBK)

    InputStreamReader = FileInputStream + 编码表(GBK)
    FileReader = FileInputStream + 编码表(GBK)


    需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中

    数据源：
            a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader
    目的地：
            b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderDemo {
    public static void main(String[] args) throws IOException {

        //封装源文件
        FileReader fr = new FileReader("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\StringCoding.java");

        //封装目的地
        FileWriter fw = new FileWriter("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\demo2.txt");

        //复制

        //一次一个字符
       /* int ch = 0;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
            fw.flush();
        }*/

       //字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1){
            fw.write(chs);
        }

        //释放资源
        fr.close();
        fw.close();

    }
}
