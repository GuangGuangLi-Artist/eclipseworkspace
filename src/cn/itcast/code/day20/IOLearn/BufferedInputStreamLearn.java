package cn.itcast.code.day20.IOLearn;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamLearn {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\eclipseworkspace\\fos.txt"));


       /* int bys = 0;
        while ((bys = bis.read()) != -1){
            System.out.print((char)bys);
        }*/




        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len));
        }

        bis.close();
    }
}
