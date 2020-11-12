package cn.itcast.code.day18.TreeMapLearn;

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapLearn {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<>();

        tm.put("hello","苏表");
        tm.put("world","世界");
        tm.put("world","世界2");
        tm.put("java","加瓦");
        tm.put("java","加瓦EE");

        Set<String> keySet = tm.keySet();
        for(String s: keySet){
            String value = tm.get(s);
            System.out.println(s + "----" + value);
        }


        System.out.println("-----");
        //按照年龄排序，如果年龄相同，需要确认名字是不一样的人
        TreeMap<StudentsDemo,String> tm2 = new TreeMap<StudentsDemo,String>(new Comparator<StudentsDemo>() {
            @Override
            public int compare(StudentsDemo o1, StudentsDemo o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s7 = new StudentsDemo("金明卷",24,"女");


        tm2.put(s1,"001");
        tm2.put(s2,"002");
        tm2.put(s3,"003");
        tm2.put(s4,"004");
        tm2.put(s5,"005");
        tm2.put(s6,"006");
        tm2.put(s6,"007");

        Set<StudentsDemo> keySet2 = tm2.keySet();
        //排序时需要实现comparator方法
        for(StudentsDemo sd: keySet2){
            String value = tm2.get(sd);
            System.out.println(sd.getName() + "---" + sd.getAge() + "---" + value);
        }

    }
}
