package cn.itcast.code.day21.IOTest;
/*
    复制文本文件的5钟方式
 */

import java.io.*;

public class CopyTextFive {
    public static void main(String[] args) throws IOException {
        String srcFile = "E:\\eclipseworkspace\\fos.txt";
        String descFile = "E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\des.txt";
        
        //copymethod1(srcFile,descFile);
        //copymethod2(srcFile, descFile);
        //copymethod3(srcFile,descFile);
        //copymethod4(srcFile,descFile);
        copymethod5(srcFile,descFile);
    }

    private static void copymethod5(String srcFile, String descFile) throws IOException {

        //字符缓冲流一次读取一行字符串
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(descFile));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }

    private static void copymethod4(String srcFile, String descFile) throws IOException {
        //字符缓冲流一次读取一个字符数组
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(descFile));

        char[] chs = new char[1024];
        int len = 0;
        while ((len=br.read(chs)) != -1){
            bw.write(chs);
        }

        br.close();
        bw.close();

    }

    private static void copymethod3(String srcFile, String descFile) throws IOException {

        //字符缓冲流一次读取一个字符
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(descFile));

        int ch = 0;
        while ((ch=br.read()) != -1){
            bw.write(ch);
        }

        br.close();
        bw.close();
    }

    private static void copymethod2(String srcFile, String descFile) throws IOException {

        //基本字符流一次读取一个字符数组
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(descFile);


        char[] chs = new char[1024];
        int len = 0;
        while ((len=fr.read(chs)) != -1){
            fw.write(chs);
        }

        fr.close();
        fw.close();
    }

    private static void copymethod1(String srcFile,String descFile) throws IOException {
        //基本字符流一次复制一个字节
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(descFile);


        int ch = 0;
        while ((ch=fr.read()) != -1){
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}
