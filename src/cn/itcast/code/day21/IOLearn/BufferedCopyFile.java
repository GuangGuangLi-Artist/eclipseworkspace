package cn.itcast.code.day21.IOLearn;

import java.io.*;

public class BufferedCopyFile {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\day21笔记.md"));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\line.txt"));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        br.close();
    }
}
