package cn.itcast.code.day20.IOLearn;
/*
    向一个文件中写入一句话
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamLearn {
    public static void main(String[] args) throws IOException {

//        File file = new File("fos.txt");
//        FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("fos.txt",true);//第二个参数为true,则为追加写入
        String s = "hello IO Test";
        byte[] bys = s.getBytes();

        //public void write(byte[] b)
        fos.write(bys);
        fos.write("\r\n".getBytes());

        //public void write(int b)将指定字节写入此文件输出流
        fos.write(97);
        fos.write("\r\n".getBytes());


        //将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
        //public void write(byte[] b,int off,int len)
        fos.write("liguang".getBytes(),3,3);
        fos.write("\r\n".getBytes());

        fos.write("liguang".getBytes());
        fos.write("\r\n".getBytes());
        fos.flush();
        fos.close();


    }
}
