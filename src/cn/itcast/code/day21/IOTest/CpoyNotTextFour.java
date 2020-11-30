package cn.itcast.code.day21.IOTest;

import java.io.*;

/*
    复制图片的四种方式
 */
public class CpoyNotTextFour {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\SoftWare\\backgroundImage\\Image\\Silhouette-Couple-Love-Starry-Sky-4K-Wallpaper.jpg");
        File descFile = new File("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day21\\IOLearn\\DemoFile\\copy.jpg");

        //copyFigureMethod1(srcFile,descFile);
        //copyFigureMethod2(srcFile,descFile);
        //copyFigureMethod3(srcFile,descFile);
        copyFigureMethod4(srcFile,descFile);
    }

    private static void copyFigureMethod4(File srcFile, File descFile) throws IOException {
        //缓冲字节流一次读取一个字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len= bis.read(bys)) !=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }

    private static void copyFigureMethod3(File srcFile, File descFile) throws IOException {
        //缓冲字节流一次读取一个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descFile));

        int by = 0;
        while ((by= bis.read()) !=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    private static void copyFigureMethod2(File srcFile, File descFile) throws IOException {
        //基本字节流一次读取一个字节数组
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(descFile);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len= fis.read(bys)) !=-1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }

    private static void copyFigureMethod1(File srcFile, File descFile) throws IOException {
        //基本字节流一次读取一个字节
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(descFile);

        int by = 0;
        while ((by= fis.read()) !=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();

    }


}
