package cn.itcast.code.day17.HashSetLearn;


import java.util.LinkedHashSet;

public class LinkedHashSetLearn {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("hello");
        lhs.add("java");
        lhs.add("world");
        lhs.add("java");
        lhs.add("java");

        for(String s: lhs){
            System.out.println(s);
        }

    }
}
