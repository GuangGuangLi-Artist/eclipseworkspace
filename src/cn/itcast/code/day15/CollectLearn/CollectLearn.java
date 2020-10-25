package cn.itcast.code.day15.CollectLearn;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的。(后面会慢慢的讲解)

    Collection的功能概述：
    1：添加功能
            boolean add(Object obj):添加一个元素
            boolean addAll(Collection c):添加一个集合的元素
    2:删除功能
            void clear():移除所有元素
            boolean remove(Object o):移除一个元素
            boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
    3:判断功能
            boolean contains(Object o)：判断集合中是否包含指定的元素
            boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
            boolean isEmpty()：判断集合是否为空
    4:获取功能
            Iterator<E> iterator()(重点)
    5:长度功能
            int size():元素的个数
            面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
    6:交集功能
            boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
    7：把集合转换为数组
            Object[] toArray()
 */
public class CollectLearn {
    public static void main(String[] args) {

        //boolean add(Object obj):添加一个元素

        //public class ArrayList<E>extends AbstractList<E>implements List<E>, RandomAccess, Cloneable, Serializable List 接口的大小可变数组的实现

        Collection c = new ArrayList();

        System.out.println("c:" + c);
        System.out.println("add: " + c.add("hello"));
        System.out.println("add: " + c.add("world"));
        System.out.println("add: " + c.add("java"));
        System.out.println("c: " + c);

        //void clear():移除所有元素
//        c.clear();
//        System.out.println("clear:" + c);

        //boolean remove(Object o):移除一个元素

        /*System.out.println("remove:" + c.remove("java"));
        System.out.println("remove:" + c.remove("javaee"));
        System.out.println("c: " + c);*/

        //boolean contains(Object o)：判断集合中是否包含指定的元素
        System.out.println("contains:" + c.contains("java"));

        //boolean isEmpty()：判断集合是否为空
        System.out.println("isEmpty:" + c.isEmpty());
        System.out.println("c: " + c);

        //int size():元素的个数
        System.out.println("size:" + c.size());
        System.out.println("c: " + c);
        System.out.println("------------");


        //boolean addAll(Collection c):添加一个集合的元素
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        ((ArrayList) c1).add("abc1");
        ((ArrayList) c1).add("abc2");
        ((ArrayList) c1).add("abc3");
        ((ArrayList) c1).add("abc4");

        ((ArrayList) c2).add("abc4");
        ((ArrayList) c2).add("abc5");
        ((ArrayList) c2).add("abc6");
        ((ArrayList) c2).add("abc7");
        ((ArrayList) c1).addAll(c2);
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2 );



        //boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
        c1.removeAll(c2);
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2 );



        // boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
        //只有包含所有元素，才叫包含
        System.out.println("containsAll:" + c1.contains(c2));





        //boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
        //A,B两个集合做交集，结果保存在A,B不变
        //返回值表示A是否发生过改变
        System.out.println("retainAll:" + c1.retainAll(c2));
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2 );












    }
}
