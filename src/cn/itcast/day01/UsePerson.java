package cn.itcast.day01;
import cn.itcast.day01.Person;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Objects;


public class UsePerson {
    public static void main(String[] args) throws IOException {

        Person p1 =  new Person();
        System.out.println(p1.name);
        p1.run();

        String srcString = "E:\\pythonWorkspace\\LearningPython\\login\\login\\spiders\\github.py";
        String desString = "./copy.txt";
        method4(srcString,desString);







    }


    private static void method4(String srcString,String desString) throws IOException{
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(desString);
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }

        fw.close();
        fr.close();
    }
}
