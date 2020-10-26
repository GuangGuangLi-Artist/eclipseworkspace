package cn.itcast.code.day16.ArrayListLearn;
/*

 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();

        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("赵娜",23,"女");
        StudentsDemo s3 = new StudentsDemo("刘欢",25,"女");
        StudentsDemo s4 = new StudentsDemo("曹细细",24,"女");
        StudentsDemo s5 = new StudentsDemo("金明卷",28,"女");

        alist.add(s1);
        alist.add(s2);
        alist.add(s3);
        alist.add(s4);
        alist.add(s5);

        Iterator it = alist.iterator();
        while (it.hasNext()){
            StudentsDemo s = (StudentsDemo)it.next();
            System.out.println(s.getName() + "---" + s.getAge() + "---" + s.getGender());
        }
    }
}
