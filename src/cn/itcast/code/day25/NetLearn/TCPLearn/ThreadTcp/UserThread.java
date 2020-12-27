package cn.itcast.code.day25.NetLearn.TCPLearn.ThreadTcp;

import java.io.*;
import java.net.Socket;

public class UserThread  implements Runnable{

    private Socket s;

    public UserThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //防止名字冲突
            String newName = System.currentTimeMillis() + ".java";

            BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

            String line = null;
            while ((line=br.readLine()) !=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            bw.close();
            s.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
