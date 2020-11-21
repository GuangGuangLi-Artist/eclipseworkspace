package cn.itcast.code.day19.FileLearn;
/*
    需求：把E:\eclipseworkspace\src\cn\itcast\code\day19\FileLearn\demo\AA\\下面的视频名称修改为
 		00?_介绍.avi

 思路：
 		A:封装目录
 		B:获取该目录下所有的文件的File数组
 		C:遍历该File数组，得到每一个File对象
 		D:拼接一个新的名称，然后重命名即可。
 */

import java.io.File;

public class BatchEditFileName {
    public static void main(String[] args) {
        File srcFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day19\\FileLearn\\demo\\AA");

        File[] fileArr = srcFolder.listFiles();

        for(File file: fileArr){
            System.out.println(file.getName());
        }



    }
}
