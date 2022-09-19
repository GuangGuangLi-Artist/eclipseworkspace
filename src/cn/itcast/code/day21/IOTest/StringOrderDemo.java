package cn.itcast.code.day21.IOTest;
/*
    已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
    请编写程序读取数据内容，把数据排序后写入ss.txt中。

    分析：
            A:把s.txt这个文件给做出来
            B:读取该文件的内容，存储到一个字符串中
            C:把字符串转换为字符数组
            D:对字符数组进行排序
            E:把排序后的字符数组转换为字符串
            F:把字符串再次写入ss.txt中
 */

import java.io.*;
import java.util.Arrays;

public class StringOrderDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\s.txt"));

        String line = br.readLine();
        br.close();;

        //把字符串转换为字符数组
        char[] chs = line.toCharArray();

        //对字符数组进行排序
        Arrays.sort(chs);

        //把排序后的字符数组转换为字符串
        String newS = new String(chs);

        //把字符串再次写入ss.txt中

        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\ss.txt"));
        bw.write(newS);
        bw.newLine();
        bw.flush();
        bw.close();


    }
}
