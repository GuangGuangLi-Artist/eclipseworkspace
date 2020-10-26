package cn.itcast.code.day16.VectorLearn;
/*
    Vector的特有功能：
    1：添加功能
            public void addElement(Object obj)		--	add()
    2：获取功能
            public Object elementAt(int index)		--  get()
            public Enumeration elements()			--	Iterator iterator()
                    boolean hasMoreElements()				hasNext()
                    Object nextElement()					next()
 */

import java.util.Enumeration;
import java.util.Vector;

public class VectorLearn {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        for (int i = 0; i <v.size() ; i++) {
            String s = (String)v.elementAt(i);
            System.out.println(s);

        }

        System.out.println("------");

        Enumeration en = v.elements();//返回一个子类对象
        while (en.hasMoreElements()){
            String s = (String)en.nextElement();
            System.out.println(s);
        }


    }
}
