package cn.itcast.code.day22.IOLearn;
/*
    合并流
 */

import java.io.*;

public class SequenceInputStreamLearn {

    public static void main(String[] args) throws IOException {
        InputStream s1 = new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\a.txt");
        InputStream s2 = new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\b.txt");

        SequenceInputStream sis = new SequenceInputStream(s1,s2);
        BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\c.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=sis.read(bys)) !=-1){
            bow.write(bys,0,len);
        }

        bow.close();
        sis.close();

    }
}
