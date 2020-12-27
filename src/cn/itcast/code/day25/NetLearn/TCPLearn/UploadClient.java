package cn.itcast.code.day25.NetLearn.TCPLearn;
/*
    客户端文本文件，服务器输出文本文件
 */

import java.io.*;
import java.net.Socket;

public class UploadClient {

    public static void main(String[] args) throws IOException {

        //创建socket对象
        Socket s = new Socket("192.168.1.6",12306);

        //读取文本文件
        BufferedReader br;
        br = new BufferedReader(new FileReader("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day25\\NetLearn\\TCPLearn\\FileTest\\bos.txt"));

        //封装通道流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //Socket提供了一个终止，它会通知服务器你别等了，我没有数据过来了
        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String client = brClient.readLine();//阻塞
        System.out.println(client);

        //释放资源
        br.close();
        s.close();

    }
}
