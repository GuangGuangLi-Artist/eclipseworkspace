package cn.itcast.code.day15.CollectLearn;
/*
    iterator:
    Iterator<E> iterator():迭代器，集合的专用遍历方法
        E next()返回迭代的下一个元素。 并移动到下一个位置
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorLearn {
    public static void main(String[] args) {

        //存储字符串并遍历字符串
        Collection c = new ArrayList();
        ((ArrayList) c).add("hello"); //Object obj = "hello" 向上转型
        ((ArrayList) c).add("world");
        ((ArrayList) c).add("java");



        //Iterator<E> iterator():迭代器，集合的专用遍历方法
        Iterator it = c.iterator();//返回的是一个接口，实际返回的肯定是子类对象，这里是多态

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //System.out.println(it.next());//java.util.NoSuchElementException

        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }


        System.out.println("--------------");

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

        Iterator it1 = c1.iterator();


        while (it1.hasNext()){
            //System.out.println(it1.next());
            StudentsDemo s = (StudentsDemo)it1.next();
            System.out.println(s.getName() + "----" + s.getAge());
        }


    }
}
