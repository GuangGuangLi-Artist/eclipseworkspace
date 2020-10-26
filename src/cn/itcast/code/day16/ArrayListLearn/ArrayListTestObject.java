package cn.itcast.code.day16.ArrayListLearn;

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Iterator;

/*

需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)

	我们按照和字符串一样的操作，发现出问题了。
	为什么呢?
			我们必须思考哪里会出问题?
			通过简单的分析，我们知道问题出现在了判断上。
			而这个判断功能是集合自己提供的，所以我们如果想很清楚的知道它是如何判断的，就应该去看源码。
	contains()方法的底层依赖的是equals()方法。
	而我们的学生类中没有equals()方法，这个时候，默认使用的是它父亲Object的equals()方法
	Object()的equals()默认比较的是地址值，所以，它们进去了。因为new的东西，地址值都不同。
	按照我们自己的需求，比较成员变量的值，重写equals()即可。
	自动生成即可。
 */
public class ArrayListTestObject {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();


        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("林青霞",22,"女");

        list.add(s1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s2);
        list.add(s2);
        list.add(s6);
        list.add(s6);

        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();

        //遍历旧集合，获取每一个元素
        while (it.hasNext()){
            StudentsDemo s = (StudentsDemo)it.next();
            if(!newList.contains(s)){
                newList.add(s);

            }
        }


        //遍历新集合
        for (int i = 0; i < newList.size(); i++) {
            StudentsDemo s = (StudentsDemo) newList.get(i);
            System.out.println(s);

        }
    }
}
