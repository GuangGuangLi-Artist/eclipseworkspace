package cn.itcast.code.day25.NetLearn.TCPLearn;
/*
    TCP协议接收数据：
    A:创建接收端的Socket对象
    B:监听客户端连接。返回一个对应的Socket对象
    C:获取输入流，读取数据显示在控制台
    D:释放资源
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //创建接收端的Socket对象
        //此类实现服务器套接字
        ServerSocket ss = new ServerSocket(12306);

        //监听客户端连接。返回一个对应的Socket对象
        Socket s = ss.accept();

        //获取输入流，读取数据显示在控制台
        //包装通道内容的流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));


        String line = null;
        while ((line=br.readLine()) !=null){
            System.out.println(line);
        }



        //br.close();
        s.close();
        //ss.close();





    }
}
