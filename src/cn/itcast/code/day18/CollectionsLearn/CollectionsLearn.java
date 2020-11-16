package cn.itcast.code.day18.CollectionsLearn;
/*
    Collections:是针对集合进行操作的工具类，都是静态方法。

	面试题：
	Collection和Collections的区别?
	Collection:是单列集合的顶层接口，有子接口List和Set。
	Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法

	要知道的方法
	public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
	public static <T> int binarySearch(List<?> list,T key):二分查找
	public static <T> T max(Collection<?> coll):最大值
	public static void reverse(List<?> list):反转
	public static void shuffle(List<?> list):随机置换
 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsLearn {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        //public static <T> void sort(List<T> list)
        Collections.sort(list);
        System.out.println("Sort:" + list); //[10, 20, 30, 40, 50]

        //public static <T> int binarySearch(List<?> list,T key):二分查找
        System.out.println("binarySearch: " + Collections.binarySearch(list,30));
        System.out.println("binarySearch: " + Collections.binarySearch(list,300));

        //public static <T> T max(Collection<?> coll):最大值
        System.out.println("max: " + Collections.max(list));

        //public static void reverse(List<?> list):反转
        Collections.reverse(list);
        System.out.println("reverse: " + list);

        //public static void shuffle(List<?> list):随机置换
        Collections.shuffle(list);
        System.out.println("shuffle: " + list);


        //Collections存自定义对象
        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s6 = new StudentsDemo("金明卷",28,"女");
        StudentsDemo s7 = new StudentsDemo("金明卷",24,"女");

        List<StudentsDemo> listStu = new ArrayList<>();
        listStu.add(s1);
        listStu.add(s2);
        listStu.add(s3);
        listStu.add(s4);
        listStu.add(s5);
        listStu.add(s6);
        listStu.add(s7);

        //需要实现Compareable排序接口
        Collections.sort(listStu);//实现自然排序

        //方式二 比较器排序
        //如果同时有自然排序和比较器排序，那么以比较器排序为准
        Collections.sort(listStu, new Comparator<StudentsDemo>() {
            @Override
            public int compare(StudentsDemo o1, StudentsDemo o2) {
                int num = o2.getAge() - o1.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        System.out.println("Object_sort: " + listStu);






    }
}
