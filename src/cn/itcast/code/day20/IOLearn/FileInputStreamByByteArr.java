package cn.itcast.code.day20.IOLearn;
/*
    按照数组的形式读取数据的标准代码
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamByByteArr {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("E:\\eclipseworkspace\\fos.txt");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1){
            System.out.print(new String(bys,0,len));
        }

        fis.close();
    }
}
