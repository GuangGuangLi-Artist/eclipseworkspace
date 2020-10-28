package cn.itcast.code.day16.EnhanceForLearn;
/*
    JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举

    增强for:是for循环的一种。

    格式：
            for(元素数据类型 变量 : 数组或者Collection集合) {
            使用变量即可，该变量就是元素
        }

    好处：简化了数组和集合的遍历。

    弊端： 增强for的目标不能为null。
    如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.List;

public class EnhanceForLearn {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("----------");

        //增强for
        for(int x :arr){
            System.out.println(x);
        }

        System.out.println("-----");

        //字符数组
        String [] strarr = {"林青霞","姜昆","东方不败","留意"};
        for(String s:strarr){
            System.out.println(s);
        }

        System.out.println("-----");
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s: list){
            System.out.println(s);
        }

        List<String> ls = null;

        if(ls != null){
            //NullPointerException
            for(String s: ls){
                System.out.println(s);
            }
        }
        System.out.println("-------------");

        ArrayList<StudentsDemo> alst = new ArrayList<>();
        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");

        alst.add(s1);
        alst.add(s2);
        alst.add(s3);
        alst.add(s4);
        alst.add(s5);

        for(StudentsDemo stu: alst){
            System.out.println(stu.getName() + "---" + stu.getAge());
        }


    }
}
