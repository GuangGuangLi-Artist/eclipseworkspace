package cn.itcast.code.day25.NetLearn.ChatRoom;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoom {
    public static void main(String[] args) throws SocketException {

        DatagramSocket dsSend = new DatagramSocket();
        DatagramSocket dsRece = new DatagramSocket(12306);


        SendThread st = new SendThread(dsSend);
        ReceiveThread rt = new ReceiveThread(dsRece);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);

        t1.start();
        t2.start();
    }
}
