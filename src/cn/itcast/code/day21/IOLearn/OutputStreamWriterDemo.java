package cn.itcast.code.day21.IOLearn;
/*
    OutputStreamWriter的方法：
    public void write(int c):写一个字符
    public void write(char[] cbuf):写一个字符数组
    public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
    public void write(String str):写一个字符串
    public void write(String str,int off,int len):写一个字符串的一部分

    一般在英文状态下一个字母或字符占用一个字节，一个汉字用两个字节表示。

    面试题：close()和flush()的区别?
    A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
    B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\OutputStreamWriter2.txt"));

        //public void write(int c):写一个字符
        osw.write('a');

        //public void write(char[] cbuf):写一个字符数组
        char[] chs = {'b','c','d','e'};
        osw.write(chs);

        //public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
        osw.write(chs,2,2);

        //public void write(String str):写一个字符串
        osw.write("我爱中国");

        //public void write(String str,int off,int len):写一个字符串的一部分
        osw.write("字符(Character)计算机中使用的字母、数字、字和符号，比如'A'、'B'、'$'、'&'等",2,12);


        osw.flush();
        osw.close();



    }
}
