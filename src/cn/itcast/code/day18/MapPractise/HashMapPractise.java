package cn.itcast.code.day18.MapPractise;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractise {
    public static void main(String[] args) {

        //HashMap嵌套HashMap
        HashMap<String,HashMap<String,Integer>> czbkMap = new HashMap<>();

        HashMap<String,Integer> jcHashMap = new HashMap<>();
        jcHashMap.put("苏表",20);
        jcHashMap.put("苏菲",19);

        HashMap<String,Integer> jyHashMap = new HashMap<>();
        jyHashMap.put("陈诚",28);
        jyHashMap.put("韩浩东",29);


        czbkMap.put("基础班",jcHashMap);
        czbkMap.put("就业班",jyHashMap);

        //遍历Map
        Set<String> keySet = czbkMap.keySet();
        for(String s:keySet){
            HashMap<String,Integer> mapValue = czbkMap.get(s);
            Set<String> innerKey = mapValue.keySet();
            for(String innerS: innerKey){
                Integer value = mapValue.get(innerS);
                System.out.println(innerS + "----" + value);
            }
        }
    }
}
