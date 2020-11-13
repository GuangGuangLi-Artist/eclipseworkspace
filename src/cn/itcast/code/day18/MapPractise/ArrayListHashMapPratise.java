package cn.itcast.code.day18.MapPractise;
/*
    ArrayList集合嵌套HashMap集合并遍历。
  需求：
  	假设ArrayList集合的元素是HashMap。有3个。
  	每一个HashMap集合的键和值都是字符串。
  	元素我已经完成，请遍历。
  结果：
	 周瑜---小乔
	 吕布---貂蝉

	 郭靖---黄蓉
	 杨过---小龙女

	 令狐冲---任盈盈
	 林平之---岳灵珊

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMapPratise {
    public static void main(String[] args) {

        ArrayList<HashMap<String,String>> at = new ArrayList<>();

        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("周瑜","小乔");
        hm1.put("吕布","貂蝉");

        HashMap<String,String> hm2 = new HashMap<>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");

        HashMap<String,String> hm3 = new HashMap<>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳灵珊");

        at.add(hm1);
        at.add(hm2);
        at.add(hm3);

        for(HashMap<String,String> hm: at){
            Set<String> set = hm.keySet();
            for(String s: set){
                String value = hm.get(s);
                System.out.println(s + "----" + value);
            }
        }




    }
}
