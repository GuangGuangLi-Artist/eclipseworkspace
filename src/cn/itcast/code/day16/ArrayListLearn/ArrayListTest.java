package cn.itcast.code.day16.ArrayListLearn;
/*
    去除集合中字符串的重复值(字符串的内容相同)
    创建一个新集合的思路
    分析：
		A:创建集合对象
		B:添加多个字符串元素(包含内容相同的)
		C:创建新集合
		D:遍历旧集合,获取得到每一个元素
		E:拿这个元素到新集合去找，看有没有
			有：不搭理它
			没有：就添加到新集合
		F:遍历新集合

    去除集合中字符串的重复值(字符串的内容相同)但是不创建新集合
    由选择排序思想引入，我们就可以通过这种思想做这个题目
    拿0索引的依次和后面的比较，有就把后的干掉
    同理，拿1索引...

 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();



        list.add("java");
        list.add("java");
        list.add("work");
        list.add("world");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("java");

        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();

        //遍历旧集合，获取每一个元素
        while (it.hasNext()){
            String s = (String)it.next();
            if(!newList.contains(s)){
                newList.add(s);

            }
        }


        //遍历新集合
        for (int i = 0; i < newList.size(); i++) {
            String s = (String) newList.get(i);
            System.out.println(s);

        }
        System.out.println("新思想方法分割线");

        //去除集合中字符串的重复值(字符串的内容相同)但是不创建新集合


        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }

            }

        }

        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(s);

        }

    }
}
