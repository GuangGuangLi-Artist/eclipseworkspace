package cn.itcast.code.day22.IOLearn;
/*
    复制多个文件的内容到一个文件
    public SequenceInputStream(Enumeration<? extends InputStream> e)
 */

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {



        Vector<InputStream> v = new Vector<>();
        InputStream s1 = new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\a.txt");
        InputStream s2 = new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\b.txt");
        InputStream s3 = new FileInputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\c.txt");

        v.add(s1);
        v.add(s2);
        v.add(s3);

        Enumeration<InputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\d.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=sis.read(bys)) !=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        sis.close();
    }
}
