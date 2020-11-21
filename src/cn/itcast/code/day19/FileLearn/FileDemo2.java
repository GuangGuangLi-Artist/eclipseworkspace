package cn.itcast.code.day19.FileLearn;
/*
    判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称

分析：
		A:封装e判断目录
		B:获取该目录下所有文件或者文件夹的File数组
		C:遍历该File数组，得到每一个File对象，然后判断
		D:是否是文件
			是：继续判断是否以.jpg结尾
				是：就输出该文件名称
				否：不搭理它
			否：不搭理它


    判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
    A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。
    B:获取的时候就已经是满足条件的了，然后输出即可。

    要想实现这个效果，就必须学习一个接口：文件名称过滤器
    public String[] list(FilenameFilter filter)
    public File[] listFiles(FilenameFilter filter)
 */

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {

    public static void main(String[] args) {
        File file = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\text");

       /* File[] fileArr = file.listFiles();

        for(File file_for: fileArr){
            if(file_for.isFile()){
                if(file_for.getName().endsWith(".txt")){
                    System.out.println(file_for.getName());
                }
            }
        }*/


       //方法2
        String[] strArr = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                File file1 = new File(dir,name);
//                boolean flag = file1.isFile();
//                boolean flag2 = file1.getName().endsWith(".txt");
//                return  flag  && flag2;

                return new File(dir,name).isFile() && name.endsWith("txt");
            }
        });

        for(String s2: strArr){
            System.out.println(s2);
        }

    }
}
