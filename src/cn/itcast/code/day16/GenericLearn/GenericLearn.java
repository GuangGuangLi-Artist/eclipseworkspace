package cn.itcast.code.day16.GenericLearn;
/*

        ArrayList存储字符串并遍历

     我们按照正常的写法来写这个程序， 结果确出错了。
     为什么呢?
            因为我们开始存储的时候，存储了String和Integer两种类型的数据。
            而在遍历的时候，我们把它们都当作String类型处理的，做了转换，所以就报错了。
     但是呢，它在编译期间却没有告诉我们。
     所以，我就觉得这个设计的不好。
     回想一下，我们的数组
            String[] strArray = new String[3];
            strArray[0] = "hello";
            strArray[1] = "world";
            strArray[2] = 10;
     集合也模仿着数组的这种做法，在创建对象的时候明确元素的数据类型。这样就不会在有问题了。
     而这种技术被称为：泛型。

     泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。参数化类型，把类型当作参数一样的传递。
     格式：
            <数据类型>
            此处的数据类型只能是引用类型。
     好处：
            A:把运行时期的问题提前到了编译期间
            B:避免了强制类型转换
            C:优化了程序设计，解决了黄色警告线
 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericLearn {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        //list.add(new Integer(100));
        //list.add(100);//list.add(Integer.valueOf(100));自动装箱


        Iterator<String> it = list.iterator();
        while (it.hasNext()){

            //ClassCastException
            //String s = (String)it.next();
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------");

        ArrayList<StudentsDemo> al = new ArrayList<>();

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

        Iterator<StudentsDemo> it2 = al.iterator();

        while (it2.hasNext()){
            StudentsDemo s = it2.next();
            System.out.println(s.getName() + "--" + s.getAge() + "----" + s.getGender());
        }
        System.out.println("------------");
        for (int i = 0; i <al.size(); i++) {
            StudentsDemo s = al.get(i);
            System.out.println(s.getName() + "--" + s.getAge() + "----" + s.getGender());

        }




    }
}
