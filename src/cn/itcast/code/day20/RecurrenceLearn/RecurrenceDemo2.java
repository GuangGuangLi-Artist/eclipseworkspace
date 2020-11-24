package cn.itcast.code.day20.RecurrenceLearn;
/*
    需求：递归删除带内容的目录

目录我已经给定：demo

分析：
		A:封装目录
		B:获取该目录下的所有文件或者文件夹的File数组
		C:遍历该File数组，得到每一个File对象
		D:判断该File对象是否是文件夹
			是：回到B
			否：就删除
 */

import java.io.File;

public class RecurrenceDemo2 {
    public static void main(String[] args) {

        File srcFile = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day20\\Demo");

        deleteFolder(srcFile);


    }

    private static void deleteFolder(File srcFile) {
        File[] fileArr = srcFile.listFiles();

        for(File file: fileArr){
            if(file.isDirectory()){
                deleteFolder(file);
            }else {
                System.out.println(file.getName() + "----" + file.delete());
            }
        }
        System.out.println(srcFile.getName() + "----" + srcFile.delete());
    }
}
