package cn.itcast.code.day22.IOLearn;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SystemOutDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.flush();
        bw.close();
    }
}
