package cn.itcast.code.day20.IOLearn;
/*
    拷贝数据
 */

import java.io.*;

public class CopyFileLearn {
    public static void main(String[] args) throws IOException {
        FileInputStream srcFile = new FileInputStream("F:\\ideaWorkspace\\eclipseworkspace\\fos.txt");

        FileOutputStream descFile = new FileOutputStream("F:\\ideaWorkspace\\eclipseworkspace\\des.txt");

        int by = 0;
        while ((by = srcFile.read()) != -1){
            descFile.write(by);
        }

        descFile.close();
        srcFile.close();
    }
}
