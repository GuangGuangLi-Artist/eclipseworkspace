package cn.itcast.code.day20.IOLearn;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamLearn {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("E:\\eclipseworkspace\\bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);*/

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\ideaWorkspace\\eclipseworkspace\\bos.txt"));


        //写数据
        bos.write("hello".getBytes());

        bos.close();

    }
}
