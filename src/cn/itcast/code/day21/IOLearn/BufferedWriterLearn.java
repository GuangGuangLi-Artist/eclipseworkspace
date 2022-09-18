package cn.itcast.code.day21.IOLearn;
/*
    字符缓冲流的特殊方法：
    BufferedWriter:
            public void newLine():根据系统来决定换行符
    BufferedReader:
            public String readLine()：一次读取一行数据
            包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterLearn {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\bw.txt"));

        bw.write("hwllo");
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("啊啊啊");
        bw.close();

    }
}
