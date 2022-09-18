package cn.itcast.code.day20.RecurrenceLearn;

/*
    需求：请大家把E:\JavaSE目录下所有的java结尾的文件的绝对路径给输出在控制台。

分析：
		A:封装目录
		B:获取该目录下所有的文件或者文件夹的File数组
		C:遍历该File数组，得到每一个File对象
		D:判断该File对象是否是文件夹
			是：回到B
			否：继续判断是否以.java结尾
				是：就输出该文件的绝对路径
				否：不搭理它
 */

import java.io.File;

public class RecurrenceDemo1 {
    public static void main(String[] args) {
        File srcFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code");

        //递归实现功能
        getallJavaFilePath(srcFolder);

    }

    private static void getallJavaFilePath(File srcFolder) {
        //获取目录下的所有目录的数组
        File[] fileArr = srcFolder.listFiles();

        for(File file: fileArr){
            if(file.isDirectory()){
                getallJavaFilePath(file);
            }else {
                if(file.getName().endsWith(".md")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
