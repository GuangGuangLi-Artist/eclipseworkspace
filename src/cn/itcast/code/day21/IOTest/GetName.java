package cn.itcast.code.day21.IOTest;
/*
    从E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\name.txt"
    文件中随机获取一个名字
    分析：
        读取文件
        存储到集合
        随机产生一个索引
        根据索引获取一个值
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GetName {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new FileReader("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\name.txt"));

        ArrayList<String> arr = new ArrayList<>();

        String line = null;
        while ((line=br.readLine()) != null){
            arr.add(line);
        }
        br.close();

        Random r = new Random();
        int index = r.nextInt(arr.size());
        String name = arr.get(index);

        System.out.println("本次中奖者是:" + name);


    }
}
