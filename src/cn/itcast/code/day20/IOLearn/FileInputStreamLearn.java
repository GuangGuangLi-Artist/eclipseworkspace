package cn.itcast.code.day20.IOLearn;
/*
    读数据
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamLearn {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\eclipseworkspace\\fos.txt");

        /*int bys = fis.read();
        while(bys!=-1){
            System.out.print((char)bys);
            bys = fis.read();
        }*/

        //标准版
        int bys = 0;
        while ((bys = fis.read()) != -1){
            System.out.print((char)bys);
        }


        fis.close();

    }
}
