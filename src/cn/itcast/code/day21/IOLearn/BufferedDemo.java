package cn.itcast.code.day21.IOLearn;
/*
    字符缓冲流的特殊方法：
    BufferedWriter:
            public void newLine():根据系统来决定换行符
    BufferedReader:
            public String readLine()：一次读取一行数据
            包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {

        writer();

        BufferedReader br = new BufferedReader(new FileReader("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\bw2.txt"));

        String line = null;
        while ((line = br.readLine()) != null){//readLine()读取一个文本行。
            System.out.println(line);
        }

        br.close();


    }

    private static void writer() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\bw2.txt"));

        for(int x=0;x<10;x++){
            bw.write("hello " + x);
            bw.newLine();//写入一个行分隔符
            bw.flush();
        }

        bw.close();
    }
}
