package cn.itcast.code.day21.IOTest;
/*
    从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaveToCollection {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\name.txt"));
        ArrayList<String> arr = new ArrayList<String>();

        String line = null;
        while ((line = br.readLine()) != null){
            arr.add(line);
        }

        br.close();

        for(String s: arr){
            System.out.println(s);
        }

    }
}
