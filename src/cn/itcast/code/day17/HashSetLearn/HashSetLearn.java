package cn.itcast.code.day17.HashSetLearn;

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.HashSet;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("java");
        hs.add("java");
        hs.add("hello");
        hs.add("world");

        for(String s: hs){
            System.out.println(s);
        }


        System.out.println("-----------");
        HashSet<StudentsDemo> hs3 = new HashSet<StudentsDemo>();

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s7 = new StudentsDemo("金明卷",24,"女");

        hs3.add(s1);
        hs3.add(s2);
        hs3.add(s3);
        hs3.add(s4);
        hs3.add(s5);
        hs3.add(s6);
        hs3.add(s7);

        for(StudentsDemo sd: hs3){
            System.out.println(sd.getName() + "---" + sd.getAge() + "------" + sd.getGender());
        }
    }
}
