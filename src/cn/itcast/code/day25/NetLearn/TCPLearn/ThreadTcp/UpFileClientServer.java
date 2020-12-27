package cn.itcast.code.day25.NetLearn.TCPLearn.ThreadTcp;

import java.io.*;
import java.net.Socket;

public class UpFileClientServer {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.6",11111);

        BufferedReader br = new BufferedReader(new FileReader("E:\\eclipseworkspace\\fos.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line=br.readLine()) !=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        //接受反馈
        BufferedReader brCli = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String lineCli = brCli.readLine();
        System.out.println(lineCli);

        //释放
        br.close();
        s.close();
    }
}
