package cn.itcast.code.day21.IOLearn;
/*
    InputStreamReader的方法：
    int read():一次读取一个字符
    int read(char[] chs):一次读取一个字符数组
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\OutputStreamWriter.txt"));

       /* int ch = 0;
        while ((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }*/

       char[] chs = new char[1024];
       int len = 0;
       while ((len = isr.read(chs)) != -1){
           System.out.print(new String(chs,0,len));
       }


        isr.close();


    }
}
