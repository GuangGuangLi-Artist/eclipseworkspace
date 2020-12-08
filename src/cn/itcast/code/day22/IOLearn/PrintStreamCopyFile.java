package cn.itcast.code.day22.IOLearn;
/*
    需求：DataStreamDemo.java复制到Copy.java中
    数据源：
            DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
    目的地：
            Copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
 */

import java.io.*;

public class PrintStreamCopyFile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\pw.txt"));

        PrintWriter pw = new PrintWriter(new FileWriter("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\dos_copy.txt"),true);


        String line = null;
        while ((line = br.readLine()) != null){
            pw.println(line);
        }

        pw.close();
        br.close();

    }
}
