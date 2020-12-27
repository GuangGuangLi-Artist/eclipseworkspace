package cn.itcast.code.day25.NetLearn.ChatRoom;

import cn.itcast.code.day25.NetLearn.UDPLearn.ReceiveLearn;

import java.io.IOException;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {

    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            ReceiveLearn.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
