package cn.itcast.code.day16.LinkedListLearn;
/*
    请用LinkedList模拟栈数据结构的集合，并测试


 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        /*LinkedList link = new LinkedList();

        link.addFirst("hello");
        link.addFirst("world");
        link.addFirst("java");

        Iterator it = link.iterator();*/

        MyStack ms = new MyStack();

        ms.add("hello");
        ms.add("world");
        ms.add("java");


        /*System.out.println(ms.get());
        System.out.println(ms.get());
        System.out.println(ms.get());*/

        while (!ms.isEmpty()){
            System.out.println(ms.get());
        }



    }
}
