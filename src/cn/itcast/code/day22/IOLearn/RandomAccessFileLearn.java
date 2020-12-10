package cn.itcast.code.day22.IOLearn;
/*
    随机访问流：
            		RandomAccessFile类不属于流，是Object类的子类。
            		但它融合了InputStream和OutputStream的功能。
            		支持对文件的随机访问读取和写入。

            public RandomAccessFile(String name,String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
            		模式有四种，我们最常用的一种叫"rw",这种方式表示我既可以写数据，也可以读取数据
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileLearn {
    public static void main(String[] args) throws IOException {


        //randomAccessFilewrite();
        randomAccessFileread();
    }

    private static void randomAccessFilewrite() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\raf.txt","rw");

        raf.writeInt(1000);
        raf.writeChar('a');
        raf.writeUTF("中国");
        raf.close();
    }

    private static void randomAccessFileread() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\raf.txt","rw");

        int i = raf.readInt();
        System.out.println(i);
        System.out.println("当前指针的位置是: " + raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println("当前指针的位置是: " + raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("当前指针的位置是: " + raf.getFilePointer());

        raf.close();


    }
}
