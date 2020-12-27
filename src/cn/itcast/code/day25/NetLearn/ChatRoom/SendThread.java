package cn.itcast.code.day25.NetLearn.ChatRoom;

import cn.itcast.code.day25.NetLearn.UDPLearn.SendLearn;


import java.io.IOException;
import java.net.DatagramSocket;


public class SendThread  implements Runnable{

    private DatagramSocket ds;

    public SendThread(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            SendLearn.send();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
