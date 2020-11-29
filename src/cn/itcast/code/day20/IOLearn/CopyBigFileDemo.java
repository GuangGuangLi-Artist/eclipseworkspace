package cn.itcast.code.day20.IOLearn;


import java.io.*;

public class CopyBigFileDemo {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();


        //filemethod1("F:\\音乐\\新建文件夹\\BBC.2015.猎捕（7集全）- 720p\\The Hunt 1 of 7 - The Hardest Challenge CC HDTV x264 AC3 5.1 [DD] 720p.mkv","copy1.mkv");
        //filemethod2("F:\\音乐\\新建文件夹\\BBC.2015.猎捕（7集全）- 720p\\The Hunt 1 of 7 - The Hardest Challenge CC HDTV x264 AC3 5.1 [DD] 720p.mkv","copy2.mkv");
        //filemethod3("F:\\音乐\\新建文件夹\\BBC.2015.猎捕（7集全）- 720p\\The Hunt 1 of 7 - The Hardest Challenge CC HDTV x264 AC3 5.1 [DD] 720p.mkv","copy3.mkv");
        filemethod4("F:\\音乐\\新建文件夹\\BBC.2015.猎捕（7集全）- 720p\\The Hunt 1 of 7 - The Hardest Challenge CC HDTV x264 AC3 5.1 [DD] 720p.mkv","copy4.mkv");

        long end = System.currentTimeMillis();
        System.out.println("共耗时: " + (end - start) + "毫秒" );

    }

    private static void filemethod4(String srcString,String descString) throws IOException {
        BufferedInputStream  bis= new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descString));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }


        bos.close();
        bis.close();

        //42635毫秒


    }

    private static void filemethod3(String srcString,String descString) throws IOException {

        BufferedInputStream  bis= new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descString));

        int by = 0;
        while ((by = bis.read()) != -1){
            bos.write(by);
        }

        bos.close();
        bis.close();


    }

    private static void filemethod2(String srcString,String descString) throws IOException {

        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(descString);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();

        //47140毫秒

    }

    private static void filemethod1(String srcString,String descString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(descString);

        int by = 0;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
