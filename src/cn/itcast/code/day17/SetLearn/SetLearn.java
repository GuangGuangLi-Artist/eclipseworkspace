package cn.itcast.code.day17.SetLearn;

import java.util.HashSet;
import java.util.Set;

public class SetLearn {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");


        for(String s: set){
            System.out.println(s);
        }
    }
}
