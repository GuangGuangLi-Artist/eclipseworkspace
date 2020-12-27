package cn.itcast.code.day25.NetLearn.TCPLearn;

import java.io.*;
import java.net.Socket;

/*
    TCP协议发送数据：
A:创建发送端的Socket对象
		这一步如果成功，就说明连接已经建立成功了。
B:获取输出流，写数据
C:释放资源

连接被拒绝。TCP协议一定要先看服务器。
java.net.ConnectException: Connection refused: connect
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //键盘录入数据，显示在控制台

        //创建发送端的Socket对象
        Socket s = new Socket("192.168.1.6",12306);


        //键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //包装通道内的数据流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //获取输出流，写数据
        String line = null;
        while ((line=br.readLine()) != null){
            if("886".equals(line)){
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();







    }
}
