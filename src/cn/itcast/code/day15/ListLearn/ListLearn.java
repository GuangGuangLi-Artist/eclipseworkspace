package cn.itcast.code.day15.ListLearn;

/*
    List接口概述
        有序的 collection（也称为序列）。此接口的用户可以对列表中每个元素的插入位置进行精确地控制。用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。

        与 set 不同，列表通常允许重复的元素。

        List接口成员方法
            void add(int index,E element) 在指定位置添加元素
            E remove(int index) 移除指定位置的元素
            E get(int index)  获取指定位置的元素
            E set(int index,E element) 根据索引修改指定元素，并返回修改的元素
            ListIterator listIterator() List特有的迭代器
                boolean hasPrevious() 如果以逆向遍历列表，列表迭代器有多个元素，则返回 true
                E previous() 列表中的上一个元素。
                逆向遍历的前提是正向遍历，所以实用性并不高，在开发中使用的并不多


       List特有遍历功能
            size()和get()方法结合





 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLearn {
    public static void main(String[] args) {

        List al = new ArrayList();

        al.add("hello");
        al.add("world");
        al.add("java");

        Iterator it = al.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }




        System.out.println("------");


        List al1 = new ArrayList();



        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");

        al1.add(s1);
        al1.add(s2);
        al1.add(s3);
        al1.add(s4);
        al1.add(s5);

        Iterator it1 = al1.iterator();
        while (it1.hasNext()){
            StudentsDemo s = (StudentsDemo)it1.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }

        System.out.println("下面是LIst特有功能");

        List list = new ArrayList();

        //void add(int index,E element) 在指定位置添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(2,"javaee");
        System.out.println("list " + list);

        //E get(int index)  获取指定位置的元素
        System.out.println("get: " + list.get(1));

        //E set(int index,E element) 根据索引修改指定元素，并返回修改的元素
        System.out.println("set: " + list.set(2,"python"));
        System.out.println("list " + list);



        //E remove(int index) 移除指定位置的元素

        System.out.println("remove: " + list.remove(0));
        System.out.println("list " + list);
        System.out.println("list特有遍历功能");

        for (int i = 0; i <list.size() ; i++) {
            //System.out.println(list.get(i));
            String s = (String)list.get(i);
            System.out.println(s);
        }


        //ListIterator listIterator() List特有的迭代器
        ListIterator lt = list.listIterator();
        while (lt.hasNext()){
            String s = (String)lt.next();
            System.out.println(s);
        }

        System.out.println("逆向遍历");

        while (lt.hasPrevious()){
            String s = (String)lt.previous();
            System.out.println(s);
        }












    }
}
