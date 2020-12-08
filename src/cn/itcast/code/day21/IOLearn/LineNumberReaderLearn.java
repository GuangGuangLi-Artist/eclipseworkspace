package cn.itcast.code.day21.IOLearn;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderLearn {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("E:\\eclipseworkspace\\fos.txt"));

        lnr.setLineNumber(20);
        String line = null;
        while ((line = lnr.readLine()) != null){

            System.out.println(lnr.getLineNumber() + ":" + line);
        }

        lnr.close();
    }
}
