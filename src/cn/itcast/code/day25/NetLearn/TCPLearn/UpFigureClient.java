package cn.itcast.code.day25.NetLearn.TCPLearn;

import java.io.*;
import java.net.Socket;

/*
    上传图片
 */
public class UpFigureClient {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.1.6",12306);


        //读取数据
        BufferedInputStream bis;
        bis = new BufferedInputStream(new FileInputStream("D:\\SoftWare\\backgroundImage\\Image\\Silhouette-Couple-Love-Starry-Sky-4K-Wallpaper.jpg"));


        //封装数据流到通道
        BufferedOutputStream bws = new BufferedOutputStream(s.getOutputStream());

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=bis.read(bys)) !=-1){
            bws.write(bys,0,len);
            bws.flush();
        }

        s.shutdownOutput();

        //读取反馈
        InputStream is = s.getInputStream();
        byte[] bysClient = new byte[1024];
        int lenClient = 0;
        while ((lenClient=is.read(bysClient)) !=-1){
            System.out.println(new String(bysClient,0,lenClient));
        }

        bis.close();
        s.close();
    }

}
