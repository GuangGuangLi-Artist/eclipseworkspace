package cn.itcast.code.day15.CollectLearn;
/*
    集合的遍历
        依次获取集合中的每一个元素
        把集合转换为数组
            Object[] toArray()
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectiomErgodic {

    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        ((ArrayList) c).add("hello"); //Object obj = "hello" 向上转型
        ((ArrayList) c).add("world");
        ((ArrayList) c).add("java");

        Object [] obs = c.toArray();

        for (int i = 0; i < obs.length; i++) {

            String s = (String)obs[i];//向下转型
            System.out.println(s  + "----" + s.length());

        }


        System.out.println("-------");
        Collection c1 = new ArrayList();
        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");

        c1.add(s1);
        c1.add(s2);
        c1.add(s3);
        c1.add(s4);
        c1.add(s5);

        Object []  obs1 = c1.toArray();

        for (int i = 0; i <obs1.length ; i++) {

            StudentsDemo s = (StudentsDemo)obs1[i];
            System.out.println(s.getName() + "===" + s.getAge() + "----" +  s.getGender());

        }




    }
}
