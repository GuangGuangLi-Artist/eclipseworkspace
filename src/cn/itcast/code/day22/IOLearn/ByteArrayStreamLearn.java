package cn.itcast.code.day22.IOLearn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamLearn {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        //写数据
        for (int i = 0; i < 100; i++) {
            baos.write(("hello" + i).getBytes());
        }

        //无意义，一般不写
        //baos.close();


        //public byte[] toByteArray()以 byte 数组的形式返回此输出流的当前内容。
        byte[] bys = baos.toByteArray();

        //读数据

        ByteArrayInputStream bais = new ByteArrayInputStream(bys);

        int by = 0;
        while ((by=bais.read()) !=-1){
            System.out.print((char)by);
        }

    }
}
