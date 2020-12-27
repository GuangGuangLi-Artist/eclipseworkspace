package cn.itcast.code.day25.NetLearn.TCPLearn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UpFigureServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12306);


        Socket s = ss.accept();

        //读取数据
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        //封装图片文件
        BufferedOutputStream bos;
        bos = new BufferedOutputStream(new FileOutputStream("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day25\\NetLearn\\TCPLearn\\FileTest\\copy.jpg"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=bis.read(bys)) != -1){
            bos.write(bys,0,len);
            bos.flush();
        }

        //给反馈
        OutputStream os = s.getOutputStream();
        os.write("图片上传成功".getBytes());


        bos.close();
        s.close();
    }

}
