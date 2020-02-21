package cn.itcast.day01;
import cn.itcast.day01.UsePerson;

import javax.imageio.IIOException;

public class Person {
        String name = "李广";
        String hobby = "girl";
        Boolean sex = true;
        Float score = 495.5f;
        int English = 132;

        public  void run(){
            System.out.println( this.name + " is running");
        }

}
