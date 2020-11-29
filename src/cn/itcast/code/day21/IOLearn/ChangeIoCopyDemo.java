package cn.itcast.code.day21.IOLearn;
/*
    需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中

    数据源：
            a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
    目的地：
            b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
 */

import java.io.*;

public class ChangeIoCopyDemo {
    public static void main(String[] args) throws IOException {

        //封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\书籍\\《献给阿尔吉侬的花束》.txt"),"UTF-16LE");

        //封装目的地
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\花束.txt"),"UTF-16LE");

        //复制文件
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1){
            osw.write(chs);
            osw.flush();
        }

        isr.close();
        osw.close();

    }
}
