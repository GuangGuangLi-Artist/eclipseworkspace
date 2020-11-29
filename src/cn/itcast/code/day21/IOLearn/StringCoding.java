package cn.itcast.code.day21.IOLearn;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringCoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        byte[] bys = s.getBytes();
        byte[] byGbk = s.getBytes("GBK");
        byte[] byUtf = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys));//[-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(byGbk));//[-60, -29, -70, -61]
        System.out.println(Arrays.toString(byUtf));//[-28, -67, -96, -27, -91, -67]

        String ss = new String(bys,"UTF-8");
        System.out.println(ss);




    }


}
