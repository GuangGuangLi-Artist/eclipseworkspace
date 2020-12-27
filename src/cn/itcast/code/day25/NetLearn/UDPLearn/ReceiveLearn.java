package cn.itcast.code.day25.NetLearn.UDPLearn;
/*
    UDP协议接收数据：
        A:创建接收端Socket对象
        B:创建一个数据包(接收容器)
        C:调用Socket对象的接收方法接收数据
        D:解析数据包，并显示在控制台
        E:释放资源
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveLearn {
    public static void main(String[] args) throws IOException {
        receive();
    }

    public static void receive() throws IOException {
        // A:创建接收端Socket对象
        DatagramSocket ds = new DatagramSocket(10086);

        //B:创建一个数据包(接收容器)

        while (true){
            byte[] bys = new byte[1024];
            int len = bys.length;
            DatagramPacket pack = new DatagramPacket(bys,len);

            //C:调用Socket对象的接收方法接收数据
            ds.receive(pack);


            // 解析数据包，并显示在控制台
            String ip = pack.getAddress().getHostAddress();
            String data =new String(pack.getData(),0,pack.getLength());
            System.out.println("from " + ip + " data is :" + data);
        }

        //释放资源
        //ds.close();

    }
}
