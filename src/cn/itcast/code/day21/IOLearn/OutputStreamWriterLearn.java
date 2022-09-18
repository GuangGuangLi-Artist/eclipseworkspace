package cn.itcast.code.day21.IOLearn;
/*
    OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
    OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
    把字节流转换为字符流。
    字符流 = 字节流 +编码表。
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterLearn {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw;
        osw = new OutputStreamWriter(new FileOutputStream("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\OutputStreamWriter.txt"),"UTF-8");

        osw.write("中国");

        osw.close();


    }

}
