package cn.itcast.code.day21.IOLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderLearn {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("F:\\ideaWorkspace\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\bw.txt"));

        int ch = 0;
        while ((ch = br.read()) != -1){
            System.out.print((char)ch);
        }

        br.close();
    }
}
