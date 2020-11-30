package cn.itcast.code.day21.IOTest;
/*
    复制单极文件夹
        数据源：E:\eclipseworkspace\src\cn\itcast\code\day21\IOLearn\SrcFolder
        目的地：E:\eclipseworkspace\src\cn\itcast\code\day21\IOLearn\DemoFile

       分析：
            封装目录
            获取该目录下的所有文本的File数组
            遍历该File数组，得到每一个File对象
            把该File进行复制
 */

import java.io.*;


public class CopyFolder {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\SrcFolder");
        File descFolder = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\DescFolder");


        if(!(descFolder.exists())){
            descFolder.mkdirs();
        }

        File[] files = srcFolder.listFiles();
        for(File file:files){
            //System.out.println(file);
            String name = file.getName();

            //拼接新的文件地址
            File newFile = new File(descFolder,name);

            copyFileMethod(file,newFile);


        }

    }

    private static void copyFileMethod(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
