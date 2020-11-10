package cn.itcast.code.day17.TreeSetLearn;

import java.util.Comparator;

public class MyComparator implements Comparator<StudensCoparable> {

    //按照名字长度实现排序
    @Override
    public int compare(StudensCoparable o1, StudensCoparable o2) {
        int num = o1.getName().length() - o2.getName().length();

        int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

        int num3 = num2 == 0 ? o1.getAge() - o2.getAge() : num2;

        return num3;
    }
}
