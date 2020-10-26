package cn.itcast.code.day16.LinkedListLearn;
/*
LinkedList的特有功能：
		A:添加功能
			public void addFirst(Object e)
			public void addLast(Object e)
		B:获取功能
			public Object getFirst()
			public Obejct getLast()
		C:删除功能
			public Object removeFirst()
			public Object removeLast()
 */

import java.util.LinkedList;

public class LinkedListLearn {
    public static void main(String[] args) {

        LinkedList link = new LinkedList();
        link.add("hello");
        link.add("world");
        link.add("java");
        System.out.println(link);

        //public void addFirst(Object e)
        link.addFirst("javaee");

        //public void addLast(Object e)
        link.addLast("python");

        System.out.println(link);

        //public Object getFirst()
        Object ob = link.getFirst();
        Object ob2 = link.getLast();
        System.out.println(ob + "----" + ob2);

        //public Object removeFirst()
        link.removeFirst();
        System.out.println(link);
        link.removeLast();
        System.out.println(link);
    }
}
