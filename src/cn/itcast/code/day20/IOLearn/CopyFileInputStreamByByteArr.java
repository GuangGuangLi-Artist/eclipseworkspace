package cn.itcast.code.day20.IOLearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileInputStreamByByteArr {
    public static void main(String[] args) throws IOException {

        FileInputStream srcFile = new FileInputStream("E:\\eclipseworkspace\\fos.txt");

        FileOutputStream descFile = new FileOutputStream("E:\\eclipseworkspace\\des2.txt");

       byte[] bys = new byte[1024];
       int len = 0;

       while ((len = srcFile.read(bys)) != -1){
           descFile.write(bys,0,len);
       }

        descFile.close();
        srcFile.close();

    }
}
