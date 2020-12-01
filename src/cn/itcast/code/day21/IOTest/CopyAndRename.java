package cn.itcast.code.day21.IOTest;
/*
    需求：复制指定目录下的指定文件，并修改后缀名。
    指定的文件是：.java文件。
    指定的后缀名是：.jad
    指定的目录是：jad

    数据源：e:\\java\\A.java
    目的地：e:\\jad\\A.txt

    分析：
            A:封装目录
            B:获取该目录下的java文件的File数组
            C:遍历该File数组，得到每一个File对象
            D:把该File进行复制
            E:在目的地目录下改名
 */

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import static cn.itcast.code.day21.IOTest.CopyFolder.copyFileMethod;

public class CopyAndRename {
    public static void main(String[] args) throws IOException {
        //封装数据源
        File srcFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\SrcFolder");

        //封装目的地
        File descFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\RenameFolder");

        //如果目的地不存在就创建
        if(!(descFolder.exists())){
            descFolder.mkdirs();
        }

        //获取源目录下的java文件
        File[] fileArr = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile()  && name.endsWith(".java");
            }
        });

        //遍历File数组，获取每一个文件对象
        for(File file:fileArr){

            String name = file.getName();
            File descFile = new File(descFolder,name);

            //复制文件
            copyFileMethod(file,descFile);
        }

        //在目的地下改名
        File[] fileDescArr = descFolder.listFiles();
        for(File descFile: fileDescArr){
            String name = descFile.getName();
            String newName = name.replaceAll(".java",".txt");
            File newNameFile = new File(descFolder,newName);

            descFile.renameTo(newNameFile);
        }


    }
}
