package cn.itcast.code.day21.IOLearn;

import java.io.*;

public class InputStreamReaderLearn {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\OutputStreamWriter.txt"),"UTF-8");

        int by = 0;
        while ((by = isr.read()) != -1){
            System.out.print((char)by);
        }

        isr.close();
    }
}
