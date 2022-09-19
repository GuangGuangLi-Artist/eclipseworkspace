package cn.itcast.code.day22.IOLearn;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterLearn {

    public static void main(String[] args) throws IOException {

        //PrintWriter pw = new PrintWriter("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\pw.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\javaproject\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\pw.txt"),true);

        pw.write("hello");
        pw.write("world");
        pw.write("java");

        pw.println(100);
        pw.println(true);

    }
}
