package cn.itcast.code.day25.NetLearn.UDPLearn;
/*
    UDP协议发送数据：
    A:创建发送端Socket对象
    B:创建数据，并把数据打包
    C:调用Socket对象的发送方法发送数据包
    D:释放资源
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendLearn {
    public static void main(String[] args) throws IOException {
        send();
    }

    public static void send() throws IOException {


        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //public DatagramPacket(byte buf[], int offset, int length,InetAddress address, int port)

        /*byte[] bys = "hello UDP learn".getBytes();
        int len = bys.length;
        InetAddress add = InetAddress.getByName("192.168.1.6");
        int port = 10086;*/

        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null){
            if("bye".equals(line)){
                break;
            }

            //创建数据并打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.6"),10086);

            //调用Socket对象的发送方法发送数据包
            ds.send(dp);
        }



        //释放资源
        ds.close();
    }
}
