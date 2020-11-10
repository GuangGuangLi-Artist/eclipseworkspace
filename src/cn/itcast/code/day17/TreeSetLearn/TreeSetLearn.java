package cn.itcast.code.day17.TreeSetLearn;
/*
    排序取决于构造方法
        自然排序
        构造器排序
 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetLearn {

    public static void main(String[] args) {


        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);

        for(Integer i:ts){
            System.out.println(i);
        }

        TreeSet<StudentsDemo> ts2 = new TreeSet<>();//

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s7 = new StudentsDemo("金明卷",24,"女");

        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);
        ts2.add(s6);
        ts2.add(s7);

        //StudentsDemo cannot be cast to java.lang.Comparable  需要实现compare接口  自然排序
        for(StudentsDemo s:ts2){
            System.out.println(s.getName() + "---" + s.getAge());
        }


        System.out.println("下面是构造器排序");

        TreeSet<StudensCoparable> ts3 = new TreeSet<StudensCoparable>(new MyComparator());

        StudensCoparable s11 = new StudensCoparable("林青霞",27,"女");
        StudensCoparable s21 = new StudensCoparable("赵娜",23,"女");
        StudensCoparable s31 = new StudensCoparable("刘欢",25,"女");
        StudensCoparable s41 = new StudensCoparable("曹细细",24,"女");
        StudensCoparable s51 = new StudensCoparable("金明卷",28,"女");
        StudensCoparable s61 = new StudensCoparable("金明卷",28,"女");
        StudensCoparable s71 = new StudensCoparable("金明卷",24,"女");

        ts3.add(s11);
        ts3.add(s21);
        ts3.add(s31);
        ts3.add(s41);
        ts3.add(s51);
        ts3.add(s61);
        ts3.add(s71);

        for(StudensCoparable s: ts3){
            System.out.println(s.getName() + "---" + s.getAge());
        }


        System.out.println("构造器排序常见的匿名内部类实现方式");
        //按照名字长度实现排序

        TreeSet<StudensCoparable> ts4 = new TreeSet<StudensCoparable>(new Comparator<StudensCoparable>() {
            @Override
            public int compare(StudensCoparable o1, StudensCoparable o2) {
                int num = o1.getName().length() - o2.getName().length();

                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

                int num3 = num2 == 0 ? o1.getAge() - o2.getAge() : num2;

                return num3;
            }
        });


        StudensCoparable s12 = new StudensCoparable("林青霞",27,"女");
        StudensCoparable s22 = new StudensCoparable("赵娜",23,"女");
        StudensCoparable s32 = new StudensCoparable("刘欢",25,"女");
        StudensCoparable s42 = new StudensCoparable("曹细细",24,"女");
        StudensCoparable s52 = new StudensCoparable("金明卷",28,"女");
        StudensCoparable s62 = new StudensCoparable("金明卷",28,"女");
        StudensCoparable s72 = new StudensCoparable("金明卷",24,"女");

        ts4.add(s12);
        ts4.add(s22);
        ts4.add(s32);
        ts4.add(s42);
        ts4.add(s52);
        ts4.add(s62);
        ts4.add(s72);

        for(StudensCoparable s: ts4){
            System.out.println(s.getName() + "---" + s.getAge());
        }







    }
}
