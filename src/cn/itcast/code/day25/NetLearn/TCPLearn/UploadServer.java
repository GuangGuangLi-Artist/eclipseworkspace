package cn.itcast.code.day25.NetLearn.TCPLearn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12306);

        Socket s = ss.accept();

        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //封装文本文件
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day25\\NetLearn\\TCPLearn\\FileTest\\copybos.txt"));

        String line = null;
        while ((line= br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();


        //释放资源
        bw.close();
        s.close();
    }
}
