package cn.itcast.code.day18.MapPractise;
/*
    HashMap集合嵌套ArrayList集合并遍历。
 需求：
 		假设HashMap集合的元素是ArrayList。有3个。
 		每一个ArrayList集合的值是字符串。
 		元素我已经完成，请遍历。
 结果：
		 三国演义
		 	吕布
		 	周瑜
		 笑傲江湖
		 	令狐冲
		 	林平之
		 神雕侠侣
		 	郭靖
		 	杨过

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListPratise {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> at1 = new ArrayList<>();
        at1.add("吕布");
        at1.add("周瑜");

        ArrayList<String> at2 = new ArrayList<>();
        at2.add("令狐冲");
        at2.add("林平之");

        ArrayList<String> at3 = new ArrayList<>();
        at3.add("郭靖");
        at3.add("郭靖");

        hm.put("三国演义",at1);
        hm.put("笑傲江湖",at2);
        hm.put("神雕侠侣",at3);


        //遍历
        Set<String> keySet = hm.keySet();
        for(String s: keySet){
            ArrayList<String> at = hm.get(s);
            for(String innerS: at){
                System.out.println(s + "----" + innerS );
            }
        }



    }
}
