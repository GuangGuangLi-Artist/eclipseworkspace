package cn.itcast.code.day22.IOLearn;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {

        dataWriteMethod();


        dataReadMethod();
    }

    private static void dataWriteMethod() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\dos.txt"));
        dos.write(100);
        byte[] bys = {'a','b'};
        dos.write(bys);
        dos.write('a');
        dos.writeByte(20);
        dos.writeBoolean(true);
        dos.writeChars("hello");
        dos.writeChar(100);
        dos.writeDouble(100.123);
        dos.writeFloat(0.023f);
        dos.flush();
        dos.close();
    }

    private static void dataReadMethod() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\eclipseworkspace\\src\\cn\\itcast\\code\\day22\\IOTest\\dos.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len= dis.read(bys)) != -1){
            System.out.println(bys);
        }
    }
}
