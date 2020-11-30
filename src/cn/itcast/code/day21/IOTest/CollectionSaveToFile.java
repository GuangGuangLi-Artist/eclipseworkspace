package cn.itcast.code.day21.IOTest;
/*
    把ArrayList集合中的字符串数据存储到文本文件

 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CollectionSaveToFile {
    public static void main(String[] args) throws IOException {
        //数据源
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        //目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\array.txt"));


        for(String s: arr){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
