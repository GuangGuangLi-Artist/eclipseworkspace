package cn.itcast.code.day18.HashMapLearn;

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapLearn {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();



        hm.put("001","李广");
        hm.put("002","苏表");
        hm.put("001","苏菲");
        hm.put("003","陈诚");
        hm.put("004","蒋介石");

        Set<String> setKey = hm.keySet();
        for(String s:setKey){
            String value = hm.get(s);

            System.out.println(s + "---" + value);
        }

        System.out.println("-------");
        HashMap<Integer,String> hm2 = new HashMap<>();

        hm2.put(26,"苏苏");
        hm2.put(23,"苏飞");
        hm2.put(27,"苏表");
        hm2.put(28,"苏表");
        hm2.put(29,"李广");

        Set<Integer> setKey2 = hm2.keySet();
        for(Integer i:setKey2){
            String value = hm2.get(i);

            System.out.println(i + "---" + value);
        }

        HashMap<String, StudentsDemo> hm3 = new HashMap<>();

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s7 = new StudentsDemo("金明卷",24,"女");

        hm3.put("001",s1);
        hm3.put("002",s2);
        hm3.put("003",s3);
        hm3.put("004",s4);
        hm3.put("005",s5);
        hm3.put("006",s6);
        hm3.put("007",s7);

        Set<String> setKey3 = hm3.keySet();
        for(String s: setKey3){
            StudentsDemo value = hm3.get(s);
            System.out.println(s + "----" + value + "----" + value.getName());
        }

    }
}
