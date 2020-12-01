package cn.itcast.code.day21.IOTest;
/*
    需求：复制多极文件夹

    数据源：E:\JavaSE\day21\code\demos
    目的地：E:\\

    分析：
            A:封装数据源File
            B:封装目的地File
            C:判断该File是文件夹还是文件
                a:是文件夹
                    就在目的地目录下创建该文件夹
                    获取该File对象下的所有文件或者文件夹File对象
                    遍历得到每一个File对象
                    回到C
                b:是文件
                    就复制(字节流)
 */

import java.io.File;
import java.io.IOException;

import static cn.itcast.code.day21.IOTest.CopyFolder.copyFileMethod;

public class CopyMultistageFolder {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\SrcFolder");
        File descFile = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\descMultistage");

        //复制文件夹
        copyFolder(srcFile,descFile);

    }

    private static void copyFolder(File srcFile, File descFile) throws IOException {
        //判断该File是文件夹还是文件
        if(srcFile.isDirectory()){
            //是文件夹
            File newFolder = new File(descFile,srcFile.getName());
            newFolder.mkdirs();

            //获取该File对象下的所有文件或者文件夹File对象
            File[] fileArr = srcFile.listFiles();
            for(File file:fileArr){
                copyFolder(file,newFolder);
            }
        }else {
            //是文件
            File newFile = new File(descFile,srcFile.getName());
            copyFileMethod(srcFile,newFile);
        }
    }
}
